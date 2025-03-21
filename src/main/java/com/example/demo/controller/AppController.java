package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app") 
public class AppController{
	@GetMapping("/msg")
	public String myMessage() {
		return "Hello Springboot";
	}
}

