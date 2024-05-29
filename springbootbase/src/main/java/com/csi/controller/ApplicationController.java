package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {
	
	@GetMapping
	public String sayHello() {
		return "WELCOME TO FULL STACK Developer,pune";
	}
	
	@GetMapping("/services")
	public String sayServices() {
		return "SOFTWARE SERVICES";
	}

	@GetMapping("/product")
	public String product(){
		return "product";
	}

}
