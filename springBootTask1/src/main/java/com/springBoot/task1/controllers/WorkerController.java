package com.springBoot.task1.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.task1.model.Worker;

@RestController
@RequestMapping("/worker")
public class WorkerController {

	@GetMapping("/showWorker")
	public Worker showWorker() {
		return new Worker(1, "Shreiya", "Randive", 547995, "IT", "abc@gmail.com");
	}

	@GetMapping("/all/showWorker")
	public List<Worker> showAllWorkers() {
		return List.of(new Worker(1, "Shreiya", "Randive", 547995, "IT", "abc@gmail.com"),
				new Worker(2, "Ahsihys", "Jadhav", 54795, "Sales", "asdc@gmail.com"),
				new Worker(3, "Peeyush", "Kumar", 85795, "HR", "awec@gmail.com"));
	}
}
