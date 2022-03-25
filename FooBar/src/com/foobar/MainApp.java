package com.foobar;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		context.start();
		
		Bar bar = (Bar) context.getBean("bar");
		System.out.println(bar);
		bar.processFooName();
		
		context.stop();
		
		context.registerShutdownHook();
		context.close();
	}

}


