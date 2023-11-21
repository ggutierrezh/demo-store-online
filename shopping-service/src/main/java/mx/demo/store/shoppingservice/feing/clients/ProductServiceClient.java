package mx.demo.store.shoppingservice.feing.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import mx.demo.store.shoppingservice.dto.ProductDto;

@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductServiceClient {

	@GetMapping(path = "/products")
	public ResponseEntity<List<ProductDto>> listProduct();
}
