package mx.demo.store.shoppingservice.feing.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "customer-service", path = "/customers")
public interface CustomerServiceClient {
	
	@GetMapping
	public ResponseEntity<List<Object>> getAll();

}
