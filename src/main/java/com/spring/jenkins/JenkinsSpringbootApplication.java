package com.spring.jenkins;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JenkinsSpringbootApplication {
	
	static Logger logger = LoggerFactory.getLogger(JenkinsSpringbootApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("--------- Object Initiated -----------------");
	}

	public static void main(String[] args) {
		logger.info("--------- Appliation Execution Begins -----------------");
		SpringApplication.run(JenkinsSpringbootApplication.class, args);
	}

	@GetMapping(value = "/test")
	public String testMessage() {
		return "First Spring Boot Jar message";
	}

}
