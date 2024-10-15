package com.dependencyconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[]args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("appContext.xml");
		Employee emp=(Employee) app.getBean("emp");
		System.out.println(emp);
		
		
	}

}
