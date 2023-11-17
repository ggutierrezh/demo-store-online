package mx.demo.store.serviceproduct.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "properties")
@AllArgsConstructor
public class LecturaPropertiesTestController {

	private Environment environment;
	
	@GetMapping
	public String getEnv() {
		return environment.getProperty("msg.print");
	}
	
}
