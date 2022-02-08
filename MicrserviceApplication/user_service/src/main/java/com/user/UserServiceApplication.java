package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

	//we can call other microservice using this rest template, also there is one asyncronous way of calling it.
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
}
