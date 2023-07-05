package com.tom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomController {
	
	@GetMapping("status")
	public String appStatus() {
		return "App is running!!!";
	}
	
	 @RequestMapping("/display")
	 public String display() {
	      return "Hey, I am from external tomcat";
	 }
}
