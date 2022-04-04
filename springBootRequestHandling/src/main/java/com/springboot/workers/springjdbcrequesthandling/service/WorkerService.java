package com.springboot.workers.springjdbcrequesthandling.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springboot.workers.springjdbcrequesthandling.model.Worker;
import com.springboot.workers.springjdbcrequesthandling.repository.WorkerRepository;

@Service
public class WorkerService {
	@Resource(name = "workerMySqlRepo")
	private WorkerRepository workerRepository;

	public Worker getWorker(Integer id) {
		return this.workerRepository.findWorkerById(id);

	}

	public List<Worker> getAllWorkers() {
		return this.workerRepository.findAllWorkers();

	}

	public Boolean createWorker(Worker worker) {
		int rowsAffected = this.workerRepository.createWorker(worker);
		if (rowsAffected == 1) {
			return true;
		}
		return false;
	}

	public Boolean updateWorkerEmailId( String email, Integer id) {
		int rowsAffected = this.workerRepository.updateEmailById(email, id);
		System.out.println("rows affected " + rowsAffected);
		if (rowsAffected == 1) {
			return true;
		}
		return false;
	}

	public Boolean deleteWorker(Integer id) {
		int rowsAffected = this.workerRepository.deleteWorker(id);
		if (rowsAffected == 1) {
			return true;
		}
		return false;
	}
}
