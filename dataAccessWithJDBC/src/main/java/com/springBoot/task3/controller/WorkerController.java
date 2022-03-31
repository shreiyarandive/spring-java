package com.springBoot.task3.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.task3.model.Worker;
import com.springBoot.task3.repository.WorkerRepository;

@RestController
@RequestMapping("/worker")
public class WorkerController {

	@Autowired
	private WorkerRepository workerRepository;

	@GetMapping("/showWorker")
	public Worker showWorker() {
		return this.workerRepository.getWorker(1);

	}

	@GetMapping("/all/showWorker")
	public List<Worker> showAllWorker() {
		return this.workerRepository.getWorkers();

	}

	@GetMapping("/create")
	public String createWorker() {
		int rowsAffected = this.workerRepository.add(new Worker(9, "Shreiya", "Randive", 154245,
				new java.sql.Date(new Date().getTime()), "IT", "abc@gmail.com"));
		return rowsAffected + " rows Affected";
	}

	@GetMapping("/update")
	public String updateWorker() {
		int rowsAffected = this.workerRepository.update(new Worker(9, "Shreiya", "Randive", 154245,
				new java.sql.Date(new Date().getTime()), "IT", "mfs.akash@gmail.com"));
		return rowsAffected + " rows Affected";
	}

	@GetMapping("/delete")
	public String deleteWorker() {
		this.workerRepository.delete(9);
		return "Record deleted";
	}
}
