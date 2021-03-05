package com.hello.web;

import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController //this class is a controller, and should be converted to json automatically
@RequestMapping("/api/hello")
public class HelloController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello World";
	}
	
	//using a requestparameter..... ?name=bob.... request params usually not prefaced with forward slash
	@GetMapping("")
	public String sayHello(@RequestParam String name) {
		return "Hello "+name;
	}
	
}
