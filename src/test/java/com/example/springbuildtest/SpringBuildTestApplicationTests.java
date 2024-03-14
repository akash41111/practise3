package com.example.springbuildtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBuildTestApplicationTests {
	public static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SpringBuildTestApplicationTests.class);
	@Test
	void contextLoads() {
		LOGGER.info("It is a test class");
		assertEquals(true,true);
	}

}
