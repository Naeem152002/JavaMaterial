package com.dependencyconstructor.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[]args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("appContext3.xml");
		Employee emp=(Employee) app.getBean("emp");
		System.out.println(emp);
	}
	

}
