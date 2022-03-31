package com.springBoot.task1.model;

import java.sql.Date;

public class Worker {
	private int workerId;
	private String firstName;
	private String lastName;
	private double salary;
	private Date joiningDate;
	private String department;
	private String email;

	public Worker(int workerId, String firstName, String lastName, double salary, String department, String email) {
		super();
		this.workerId = workerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.department = department;
		this.email = email;
		this.joiningDate = new Date(new java.util.Date().getTime());
	}

	public Worker(int workerId, String lastName, double salary, String department, String email) {
		this.workerId = workerId;
		this.lastName = lastName;
		this.salary = salary;
		this.joiningDate = new Date(new java.util.Date().getTime());
		this.department = department;
		this.email = email;
	}

	public Worker(int workerId, String firstName, Date joiningDate, String email) {
		this.workerId = workerId;
		this.firstName = firstName;
		this.joiningDate = joiningDate;
		this.email = email;
	}

	public int getWorkerId() {
		return workerId;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
