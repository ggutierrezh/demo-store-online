package mx.demo.store.shoppingservice.feing.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import mx.demo.store.shoppingservice.dto.CustomerDto;

@FeignClient(name = "CUSTOMER-SERVICE", fallback = CustomerHystrixFallbackFactory.class)
public interface CustomerServiceClient {
	
	@GetMapping(path = "/customers")
	public ResponseEntity<List<CustomerDto>> getAll();

}
