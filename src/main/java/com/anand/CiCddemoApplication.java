package com.anand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCddemoApplication {
	
	@GetMapping("/greeting/{name}")
	public String greetings(@PathVariable String name) {
		return "Hello" + name + "Congratulation you are completed cicd";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(CiCddemoApplication.class, args);
		System.out.println("CI_CD application demo......");
	}

}
