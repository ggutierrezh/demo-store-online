package mx.demo.store.servicecustomer.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import mx.demo.store.servicecustomer.entity.CustomerEntity;
import mx.demo.store.servicecustomer.service.CustomerService;

@RestController
@RequestMapping(value = "/customers")
@AllArgsConstructor
public class CustomerController {

	private CustomerService customerService;

	@GetMapping
	public ResponseEntity<List<CustomerEntity>> getAll(){
		
		return ResponseEntity.ok(customerService.findCustomerAll());
	}
}
