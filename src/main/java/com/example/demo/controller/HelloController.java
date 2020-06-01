package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.annotation.MyGetMapping;

@RestController
public class HelloController {
	
	@MyGetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@MyGetMapping("/helloBean")
	public UserDetail helloBean() {
		return UserDetail.builder().firstName("Thomas").lastName("Kang").age(49).build();
	}
}
