package com.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[]args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("appContext.xml");
		UserDao dao=(UserDao)app.getBean("dao");
		System.out.println(dao);
	}

}
