package com.byconcollandcollect2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
	
	public static void main(String[]args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("appContext2.xml");
		Employee e=(Employee) applicationContext.getBean("emp");
		e.show();
	}

}
