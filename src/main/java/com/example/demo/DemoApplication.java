package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {
	
	@RequestMapping("/")
	String hello() {
		
		return "Hi Devendra!!!!!!!!, How are you? "
				 + "\n This is your updated Application HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
