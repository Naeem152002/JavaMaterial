package com.dibycon;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
	
	public static void main(String[]args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("appContext.xml");
		Employee e=(Employee)applicationContext.getBean("emp");
		e.show();
	}

}
