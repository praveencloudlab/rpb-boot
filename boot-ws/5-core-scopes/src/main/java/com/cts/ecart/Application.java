package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.model.Product;
import com.cts.ecart.service.ProductService;
import com.cts.ecart.service.ProductServiceImpl;
import com.cts.ecart.service.UserServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(Application.class, args);

		Product prod1 = new Product(10, "Spring Boot", 846);
		Product prod2 = new Product(11, "Microservices ebook", 1350);

		ProductService ps1 = ac.getBean(ProductService.class);
		ProductService ps2 = ac.getBean(ProductService.class);

		// ac.getBean(UserServiceImpl.class);

		ps1.save(prod1);
		ps2.save(prod2);

	}

}
