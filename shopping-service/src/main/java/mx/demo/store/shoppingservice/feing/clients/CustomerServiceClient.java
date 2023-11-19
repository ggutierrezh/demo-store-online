package mx.demo.store.shoppingservice.feing.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "customer-service")
public interface CustomerServiceClient {
	
	@GetMapping(path = "/customer")
	public ResponseEntity<List<Object>> getAll();

}
