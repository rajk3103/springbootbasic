package com.fullstack.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {

	@GetMapping
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<String>("WELCOME TO FULL STACK JAVA DEVELOPER", HttpStatus.OK);
	}

	@GetMapping("/services")
	public String saySerevices() {
		return "Software Development";
	}

	@GetMapping("/address")
	public String sayAddress() {
		return "PUNE, INDIA";
	}

}
