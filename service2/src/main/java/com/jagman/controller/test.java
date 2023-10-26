package com.jagman.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TEST_SERVICE")
public class test {
	
	@GetMapping("/")
		public String hello23() {
			return "greeting";
	}
	@GetMapping("/hello")
	public String hello() {
		return "Hello this is secured";
	}
	
	@GetMapping("/welcome")
	public String hello1() {
		return "welcome this is secured";
	}
}
