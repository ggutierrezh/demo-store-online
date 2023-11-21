package mx.demo.store.shoppingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import feign.Logger;
import mx.demo.store.shoppingservice.feing.clients.CustomerServiceClient;
import mx.demo.store.shoppingservice.feing.clients.ProductServiceClient;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(clients = {CustomerServiceClient.class, ProductServiceClient.class })
@EnableHystrix
@EnableHystrixDashboard
public class ShoppingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingServiceApplication.class, args);
	}
	
	@Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
