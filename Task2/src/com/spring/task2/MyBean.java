package com.spring.task2;

public class MyBean {
	private String firstName;
	private String lastName;
	
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
	
	public static MyBean getMyBeanInstance() {
		return new MyBean();
	}

	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName;
	}
	
}
