package com.fanshawe.MyFirstSpringBootProject.HelloWorldController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping("/")
	public String sayHello() {
		
		//System.out.println("Hello World");
		
		return "Hello World!";
		
	}
	
	

}
