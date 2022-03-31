package com.springBoot.task3.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springBoot.task3.dao.WorkerDAO;
import com.springBoot.task3.model.Worker;
import com.springBoot.task3.util.DatabaseConnection;

@Repository
public class WorkerRepository implements WorkerDAO {
	private static Connection connection;

	public WorkerRepository() {
		connection = DatabaseConnection.getConnection();
	}

	@Override
	public int add(Worker worker) {
		String format = """
				INSERT INTO Worker VALUES (?, ?, ?, ?, ?, ?, ?)
				""";
		try (PreparedStatement prep = connection.prepareStatement(format)) {
			prep.setInt(1, worker.getWorkerId());
			prep.setString(2, worker.getFirstName());
			prep.setString(3, worker.getLastName());
			prep.setDouble(4, worker.getSalary());
			prep.setDate(5, worker.getJoiningDate());
			prep.setString(6, worker.getDepartment());
			prep.setString(7, worker.getEmail());

			return prep.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e);
		}
		return 0;
	}

	@Override
	public void delete(int workerId){
		String format = """
				DELETE FROM Worker where worker_id = ?
				""";
		try (PreparedStatement prep = connection.prepareStatement(format)) {
			prep.setInt(1, workerId);

			prep.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	@Override
	public Worker getWorker(int workerId) {
		String format = """
				SELECT * FROM Worker
				    WHERE Worker_id = ?
				""";
		try (PreparedStatement prep = connection.prepareStatement(format)) {
			prep.setInt(1, workerId);

			ResultSet res = prep.executeQuery();
			res.next();
			return new Worker(res.getInt(1), res.getString(2), res.getString(3), res.getDouble(4), res.getDate(5),
					res.getString(6), res.getString(7));
		} catch (

		SQLException e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public List<Worker> getWorkers() {
		List<Worker> list = new ArrayList<>();
		String format = """
				SELECT * FROM Worker
				""";
		try (PreparedStatement prep = connection.prepareStatement(format)) {

			ResultSet res = prep.executeQuery();
			while (res.next()) {
				list.add(new Worker(res.getInt(1), res.getString(2), res.getString(3), res.getDouble(4), res.getDate(5),
						res.getString(6), res.getString(7)));
			}
			return list;
		} catch (SQLException e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public int update(Worker emp) {
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
				    WHERE Worker_id = ?
				""";
		try (PreparedStatement prep = connection.prepareStatement(format)) {
			prep.setInt(1, emp.getWorkerId());
			prep.setString(2, emp.getFirstName());
			prep.setString(3, emp.getLastName());
			prep.setDouble(4, emp.getSalary());
			prep.setDate(5, emp.getJoiningDate());
			prep.setString(6, emp.getDepartment());
			prep.setString(7, emp.getEmail());
			prep.setInt(8, emp.getWorkerId());

			return prep.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return 0;
	}
}
