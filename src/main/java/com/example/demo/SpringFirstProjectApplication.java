package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SpringFirstProjectApplication {

	
	@GetMapping("/")
	public String name() {
		return "welcome ";
	}
	
	@GetMapping("/message/{input}")
	public String getMessageName(@PathVariable String input) {
		return "welcome " + input;
	} 
	
	public static void main(String[] args) {
	 SpringApplication.run(SpringFirstProjectApplication.class, args);
		
	}

}
