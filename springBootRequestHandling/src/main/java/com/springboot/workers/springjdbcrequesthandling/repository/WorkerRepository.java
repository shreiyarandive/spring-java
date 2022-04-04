package com.springboot.workers.springjdbcrequesthandling.repository;

import java.util.List;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.workers.springjdbcrequesthandling.dao.WorkerDAO;
import com.springboot.workers.springjdbcrequesthandling.mapper.WorkerMapper;
import com.springboot.workers.springjdbcrequesthandling.model.Worker;

@Repository("workerMySqlRepo")
public class WorkerRepository implements WorkerDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	private static final Logger log = LoggerFactory.getLogger(WorkerRepository.class);

	@Override
	public int createWorker(Worker worker) {
		String format = """
				INSERT INTO Worker VALUES (?, ?, ?, ?, ?, ?, ?)
				""";
		try {
			return jdbcTemplate.update(format, worker.getWorkerId(), worker.getFirstName(), worker.getLastName(),
					worker.getSalary(), worker.getJoiningDate(), worker.getDepartment(), worker.getEmail());
		}catch(DataAccessException e) {
			e.getMessage();
			log.error(e.toString());
			return 0;
		}
		

	}

	@Override
	public int deleteWorker(int workerId) {
		String format = """
				DELETE FROM Worker where worker_id = ?
				""";
		try {
			return jdbcTemplate.update(format, workerId);
		
		}catch(DataAccessException e) {
			log.info(e.toString());
			return 0;
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public Worker findWorkerById(int workerId) {
		String format = """
				SELECT * FROM Worker
				    WHERE Worker_id = ?
				""";
		try {
			return jdbcTemplate.queryForObject(format, new Object[] { workerId }, new WorkerMapper());			
		}catch(DataAccessException e) {
			log.info(e.toString());
			return null;
		}
	}

	@Override
	public List<Worker> findAllWorkers() {
		String format = """
				SELECT * FROM Worker
				""";
		try {
			return jdbcTemplate.query(format, new WorkerMapper());		
		}catch(DataAccessException e) {
			log.info(e.toString());
			return null;
		}
	}

	@Override
	public int updateWorker(Worker emp) {
		String format = """
				UPDATE Worker
				    SET
				        worker_id = ?,
				        first_name = ?,
				        last_name = ?,
				        salary = ?,
				        joining_date = ?,
				        department = ?,
				        email = ?
				    WHERE worker_id = ?
				""";
		try {
			return jdbcTemplate.update(format, emp.getWorkerId(), emp.getFirstName(), emp.getLastName(), emp.getSalary(),
					emp.getJoiningDate(), emp.getDepartment(), emp.getEmail(), emp.getWorkerId());
			
		}catch(DataAccessException e) {
			log.info(e.toString());
			return 0;
		}
	}

	@Override
	public int updateEmailById(String email, int id) {
		String format = """
				UPDATE Worker
					SET	
						email = ?
					WHERE worker_id = ?
				""";
		try {
			return jdbcTemplate.update(format, email, id);			
		}catch(DataAccessException e) {
			log.info(e.toString());
			return 0;
		}
	}
}
