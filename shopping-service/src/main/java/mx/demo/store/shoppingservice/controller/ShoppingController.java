package mx.demo.store.shoppingservice.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import mx.demo.store.shoppingservice.dto.CustomerDto;
import mx.demo.store.shoppingservice.dto.ProductDto;
import mx.demo.store.shoppingservice.feing.clients.CustomerServiceClient;
import mx.demo.store.shoppingservice.feing.clients.ProductServiceClient;

@RestController
@RequestMapping(value = "/shopping")
@AllArgsConstructor
public class ShoppingController {
	
	
	private CustomerServiceClient customerServiceClient;
	private ProductServiceClient productServiceClient;

	// Metodo que manda a llamar los ms como prueba
	// esto con el objetivo de utlizar Hystrix, microservicios tolerantes a fallos
	@GetMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String, List<ProductDto>>> getProducts(){
		
		List<ProductDto> listProducts = productServiceClient.listProduct().getBody();
		Map<String, List<ProductDto>> map = new HashMap<>();
		map.put("listProducts", listProducts);
		return ResponseEntity.ok().body(map);
	}
	
	// Metodo que manda a llamar los ms como prueba
	// esto con el objetivo de utlizar Hystrix, microservicios tolerantes a fallos
	@GetMapping(value = "/customers")
	public ResponseEntity<Map<String, List<CustomerDto>>> getCutomers(){
		
		List<CustomerDto> listCustomer = customerServiceClient.getAll().getBody();
		Map<String, List<CustomerDto>> map = new HashMap<>();
		map.put("listCustomer", listCustomer);
		return ResponseEntity.ok().body(map);
	}
}
