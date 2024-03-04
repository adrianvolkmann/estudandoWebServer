package com.volkmann.estudandoWebServer.restControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {

	@RequestMapping(value = "/hellojsp", method =  RequestMethod.GET)
	public String helloJsp() {
		
		System.out.println("hellojsp");
		System.out.println("hellojsp2");
		
		return "index";
	}
	
}
