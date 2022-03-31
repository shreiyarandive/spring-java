package com.springBoot.task1.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "Hello Visitor!<br>Visiting time " + new Date();
	}
}
