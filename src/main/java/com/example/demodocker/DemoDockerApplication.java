package com.example.demodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoDockerApplication {
	
	@GetMapping("/checkup")
	public String checkup() {
		return "app is up and running";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoDockerApplication.class, args);
	}

}
