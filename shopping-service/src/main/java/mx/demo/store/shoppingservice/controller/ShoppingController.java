package mx.demo.store.shoppingservice.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
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
	@GetMapping
	public ResponseEntity<Map<String, List<Object>>> shoppingTest(){
		
		List<Object> listCustomer = customerServiceClient.getAll().getBody();
		List<Object> listProducts = productServiceClient.listProduct().getBody();
		Map<String, List<Object>> map = new HashMap<>();
		map.put("listCustomer", listCustomer);
		map.put("listProducts", listProducts);
		return ResponseEntity.ok().body(map);
	}
}
