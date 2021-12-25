package com.example.pseudorandom;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class PseudorandomApplication {

	@RequestMapping("/")
	String home() {
		return "Hello Spring Boot Continuous Delivery!";
	}

	public static void main(String[] args) {
		SpringApplication.run(PseudorandomApplication.class, args);
	}

}
