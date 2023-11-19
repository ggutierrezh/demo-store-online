package mx.demo.store.shoppingservice.feing.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "customer-service")
@RequestMapping("/customers")
public interface CustomerServiceClient {
	
	@GetMapping
	public ResponseEntity<List<Object>> getAll();

}
