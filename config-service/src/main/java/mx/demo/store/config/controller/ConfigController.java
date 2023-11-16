package mx.demo.store.config.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ConfigController {

	private Environment environment;
	
	public String getProperties() {
		return environment.getProperty("");
	}
	
}
