package com.dependencyinjectionsettermethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BulbClient {
	
	public static void main(String[]args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		BulbService bu=(BulbService) app.getBean("Bs");
		bu.askForBulb();
	

	System.out.println(bu.askForBulb());
	}

}
