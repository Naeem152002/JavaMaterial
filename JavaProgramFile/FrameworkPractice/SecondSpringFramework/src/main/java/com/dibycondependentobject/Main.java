package com.dibycondependentobject;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
	public static void main(String[]args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("appContext1.xml");
		Employee emp=(Employee) applicationContext.getBean("emp");
		emp.show();
	}

}
