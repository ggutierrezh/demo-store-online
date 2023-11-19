package mx.demo.store.shoppingservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/shopping")
public class ShoppingController {

	@GetMapping
	public ResponseEntity<String> shoppingTest(){
		
		return ResponseEntity.ok().body("");
	}
}
