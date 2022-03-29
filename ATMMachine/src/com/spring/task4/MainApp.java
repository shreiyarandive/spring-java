package com.spring.task4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		WithdrawEventPublisher publisher = context.getBean("customEventPublisher", WithdrawEventPublisher.class);
		
		SavingsAccount savings = context.getBean("savings", SavingsAccount.class);
		double amount = 0;
		if(savings.getAccBalanace() != savings.withdraw(amount)) {
			publisher.publish(amount, savings);
		}
		
		SalaryAccount salary = context.getBean("salary", SalaryAccount.class);
		if(salary.getAccBalanace() != salary.withdraw(amount)) {
			publisher.publish(amount, salary);
		}
		
	}
}
