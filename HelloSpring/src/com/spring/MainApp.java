package com.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		context.start();
		
		HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
		System.out.println(obj1.getMessage1());
		System.out.println(obj1.getMessage2());
		
		HelloIndia obj2 = (HelloIndia) context.getBean("helloIndia");
		System.out.println(obj2.getMessage1());
		System.out.println(obj2.getMessage2());
		context.stop();
		
		context.registerShutdownHook();
		context.close();
	}

}
