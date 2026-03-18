package com.ecommerce.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/admin")
	public String index() {
		
		return "index";
	}
	
	@GetMapping("/user")
	public String home() {
	
		return "home";
	}
}
