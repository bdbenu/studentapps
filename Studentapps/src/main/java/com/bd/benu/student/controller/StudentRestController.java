package com.bd.benu.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {

	@GetMapping("/test")
	public String testApi() {
		
		return "API TESTED";
	}
}
