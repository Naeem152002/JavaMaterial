package com.dto;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.UserDao;
import com.dao.UserDaoImpl;

import org.springframework.context.ApplicationContext;
public class Main {
	public static void main(String[]args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("appContext.xml");
		UserDao dao=app.getBean("dao",UserDaoImpl.class);
		dao.insert(null);
	}

}
