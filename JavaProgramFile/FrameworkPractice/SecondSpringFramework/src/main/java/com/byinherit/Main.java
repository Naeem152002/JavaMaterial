package com.byinherit;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
	public static void main(String[]args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("appContext4.xml");
		Employee e=(Employee) app.getBean("emp");
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		
	}

}
