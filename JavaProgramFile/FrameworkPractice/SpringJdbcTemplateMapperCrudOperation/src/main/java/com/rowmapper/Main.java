package com.rowmapper;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.UserDao;

import org.springframework.context.ApplicationContext;

public class Main {
	public static void main(String[]args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("appContext.xml");
		UserDao dao=(UserDao)app.getBean("dao");
		dao.insert(null);
	}

}
