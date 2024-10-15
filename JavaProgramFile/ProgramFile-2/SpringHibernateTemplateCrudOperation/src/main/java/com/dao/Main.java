package com.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

public class Main {
    public static void main(String[] args) {
    	HibernateTransactionManager
    	
        ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
        UserDao dao = (UserDao) appContext.getBean("dao");
        System.out.println(dao);
         dao.insert(null); // Uncomment and implement the insert method as needed
    }
}
