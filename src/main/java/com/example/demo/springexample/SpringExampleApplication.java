package com.example.demo.springexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringExampleApplication {
	
	@GetMapping("/")
	public String welcome()
	{
		return "Welcome to  deployment from welcome method";
	}

	
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input)
	{
		return "Welcome"+input+" your application deployed successfully";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);
	}

}
