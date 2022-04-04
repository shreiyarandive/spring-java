package com.springboot.workers.springjdbcrequesthandling.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.workers.springjdbcrequesthandling.model.Worker;
import com.springboot.workers.springjdbcrequesthandling.service.WorkerService;

@RestController
@RequestMapping("/worker")
public class WorkerController {
	@Autowired
	private WorkerService workerService;

	@GetMapping("/worker/{id}")
	public Worker showWorker(@PathVariable int id) {
		return this.workerService.getWorker(id);

	}

	@GetMapping("/all")
	public List<Worker> showAllWorker() {
		return this.workerService.getAllWorkers();

	}

	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Boolean createWorker(@RequestBody Worker worker) {
		return this.workerService.createWorker(worker);

	}

	@PatchMapping("/update/{id}")
	public Boolean updateWorker(@RequestBody Map<String, String> params, @PathVariable int id) {
		return this.workerService.updateWorkerEmailId(params.get("email"), id);

	}

	@DeleteMapping("/delete/{id}")
	public Boolean deleteWorker(@PathVariable int id) {
		return this.workerService.deleteWorker(id);

	}
}
