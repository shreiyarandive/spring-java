package com.springBoot.task3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.task3.util.Helper;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String showWelcomMessage() {
		return "Hello Visitor!<br>Visiting Time: " + Helper.getTime();
	}
}
