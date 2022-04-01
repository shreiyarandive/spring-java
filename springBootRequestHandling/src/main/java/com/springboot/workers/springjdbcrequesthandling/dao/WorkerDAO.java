package com.springboot.workers.springjdbcrequesthandling.dao;

import java.sql.SQLException;
import java.util.List;

import com.springboot.workers.springjdbcrequesthandling.model.Worker;



public interface WorkerDAO {

	public int add(Worker worker) throws SQLException;

	public int delete(int workerId) throws SQLException;

	public Worker getWorker(int workerId) throws SQLException;

	public List<Worker> getWorkers() throws SQLException;

	public int update(Worker emp) throws SQLException;
	
	public int replaceEmail(String email, int id) throws SQLException;
}
