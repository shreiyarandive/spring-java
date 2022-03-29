package com.spring.task2;

import java.util.Date;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;


public class EvenHandler implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Event refreshed at " + new Date());
		
	}

}
