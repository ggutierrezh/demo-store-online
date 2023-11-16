package mx.demo.store.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ConfigController {
	
	@GetMapping
	public String getProperties() {
		return "OK";
	}
	
}
