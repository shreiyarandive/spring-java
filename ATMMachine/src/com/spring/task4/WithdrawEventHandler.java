package com.spring.task4;

import org.springframework.context.ApplicationListener;

public class WithdrawEventHandler implements ApplicationListener<WithdrawEvent> {

	@Override
	public void onApplicationEvent(WithdrawEvent event) {
		System.out.println(event);
	}

}
