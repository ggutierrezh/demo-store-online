package mx.demo.store.serviceproduct.handler;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity< List<Map<String, String>>> handleValidationErrors(MethodArgumentNotValidException ex) {
        List<Map<String, String>> mapErros = 
        		ex.getBindingResult()
        		.getFieldErrors()
                .stream()
                .map(err -> {
                	Map<String, String> error = new HashMap<>();
                	error.put(err.getField(), err.getDefaultMessage());
                	error.put("timestamp", LocalDateTime.now().toString());
                	error.put("code", err.getCode());
                	error.put("input", Arrays.asList(err.getRejectedValue()).toString());
                	return error;
                }).collect(Collectors.toList());
        
        return new ResponseEntity<>(mapErros, new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

//    private Map<String, List<String>> getErrorsMap(List<Map<String, String>> errors) {
//        Map<String, List<String>> errorResponse = new HashMap<>();
//        errorResponse.put("errors", errors);
//        return errorResponse;
//    }
}
