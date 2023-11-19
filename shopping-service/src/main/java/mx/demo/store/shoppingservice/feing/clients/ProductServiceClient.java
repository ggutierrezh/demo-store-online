package mx.demo.store.shoppingservice.feing.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product-service")
@RequestMapping("/products")
public interface ProductServiceClient {

	@GetMapping
	public ResponseEntity<List<Object>> listProduct();
}
