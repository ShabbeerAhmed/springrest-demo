package com.wipro.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/welcome")
@RestController
public class WelcomeController {
	@GetMapping
	public String welcome() {
		return "Hello Sadarunnisa and Sana!!! This is Shabbeer!!!";
	}
}
