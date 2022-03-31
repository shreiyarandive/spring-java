package com.springBoot.task1.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

	@GetMapping("/task")
	public String sendTaskMessage() {
		return "Task demonstration";
	}

	@GetMapping("/task/showMyInfo")
	public List<String> showMyInfo() {
		return List.of("Shreiya", "Pune", "Maharashtra", "India");
	}

	@GetMapping("/task/showMyHobbies")
	public List<String> showMyHobbies() {
		return List.of("Playing Table tennis", "Travelling", "Reading");
	}
}
