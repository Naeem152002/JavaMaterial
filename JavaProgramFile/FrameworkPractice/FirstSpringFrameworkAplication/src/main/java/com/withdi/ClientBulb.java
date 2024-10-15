package com.withdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientBulb {
	
	public static void main(String[]args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BulbService bulbService=(BulbService)applicationContext.getBean("bs");
		System.out.println(bulbService.getAsk());
		System.out.println(bulbService);
		BulbService bulbService1=(BulbService) applicationContext.getBean("bs");
		System.out.println(bulbService1);
		
	}

}
