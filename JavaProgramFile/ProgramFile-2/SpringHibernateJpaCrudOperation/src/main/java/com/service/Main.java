package com.service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[]args) {
		 ApplicationContext app = new ClassPathXmlApplicationContext("appContext.xml");
		   UserService userService = (UserService) app.getBean("userService");
		   System.out.println(userService);
	}

}
