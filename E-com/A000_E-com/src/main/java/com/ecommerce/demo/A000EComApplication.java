package com.ecommerce.demo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class A000EComApplication {

	public static void main(String[] args) {
		SpringApplication.run(A000EComApplication.class, args);
	}

	@Bean
	public ModelMapper mapper() {
		
		return new ModelMapper();
		
	}
}
