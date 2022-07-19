package com.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MessageDockerImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageDockerImageApplication.class, args);
	}
	
	@GetMapping("/message")
	public String message() {
	 return "Hey There I am Springboot application image running on port: 5000";
		
	}

}
