package mx.demo.store.shoppingservice.feing.clients;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import mx.demo.store.shoppingservice.dto.CustomerDto;

@Component
public class CustomerHystrixFallbackFactory implements CustomerServiceClient {

	@Override
	public ResponseEntity<List<CustomerDto>> getAll() {
		
		CustomerDto customerDto = CustomerDto
				.builder()
				.firstName("none")
				.lastName("none")
				.email("none")
				.build();
		return ResponseEntity.ok(Arrays.asList(customerDto));
	}
}
