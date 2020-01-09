package com.example.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
	
	@GetMapping(value="/")
	public String getUi(){
		
		return "home";
	}
	
	@GetMapping(value="/secure")
	public String getSecure(){
		
		return "index";
	}
	
	@GetMapping(value="/phone")
	public String getPhone(){
		
		return "phone";
	}
	
}
