package com.springboot.workers.springjdbcexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.workers.springjdbcexample.util.DateTimeUtilities;


@RequestMapping
public class HomeController {
	@GetMapping("/")
	public String showWelcomMessage() {
		return "Hello Visitor!<br>Visiting Time: " + DateTimeUtilities.getTime();
	}
}
