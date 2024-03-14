package com.example.springbuildtest;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBuildTestApplication implements CommandLineRunner {
	
	
	public static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SpringBuildTestApplication.class);
	public static void main(String[] args) {
		LOGGER.info("It is a continious integration job");
		SpringApplication.run(SpringBuildTestApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("It is second logger");
		
	}

}
