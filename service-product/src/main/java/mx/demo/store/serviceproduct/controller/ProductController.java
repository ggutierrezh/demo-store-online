package mx.demo.store.serviceproduct.controller;

import java.util.List;
import javax.validation.Valid;

import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import mx.demo.store.serviceproduct.entity.ProductEntity;
import mx.demo.store.serviceproduct.service.ProductService;

@RestController
@RequestMapping(value = "/products") // nombre del recurso en plural
@AllArgsConstructor
public class ProductController {
	
	private ProductService productService;

	@GetMapping
	public ResponseEntity<List<ProductEntity>> listProduct(){
		
		List<ProductEntity> products = productService.listAllProduct();
		
		if(products.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(products);
	}
	
	@GetMapping(value = "{id}")
	public ResponseEntity<ProductEntity> getProductById(@PathVariable(name = "id") Long id){
		
		ProductEntity product = productService.getProduct(id);
		
		if(product == null) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(product);
	}
	
	// Para este servicio REST se esta definiendo un argumento de tipo la entidad relacional, 
	// como buena practica de desarrollo es crear un DTO/POJO
	@PostMapping
	public ResponseEntity<ProductEntity> createProduct(@RequestBody @Valid ProductEntity productEntity){
		ProductEntity productCreated = productService.createProduct(productEntity);
		return ResponseEntity.status(HttpStatus.CREATED).body(productCreated);
	}
}
