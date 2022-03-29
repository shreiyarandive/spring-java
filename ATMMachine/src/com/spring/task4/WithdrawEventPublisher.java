package com.spring.task4;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class WithdrawEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	public void publish(double amount, BankAccount account) {
		WithdrawEvent event = new WithdrawEvent(this, amount, account);
		publisher.publishEvent(event);
	}
}
