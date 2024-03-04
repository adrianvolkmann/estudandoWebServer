package com.volkmann.estudandoWebServer.restControllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@PostMapping(value = "/hello")
	public String hello() {
		
		System.out.println("hello");
		System.out.println("hello2");
		
		
		
		return "Hello World!!!!";
	}
	
	
	
	
	
}
