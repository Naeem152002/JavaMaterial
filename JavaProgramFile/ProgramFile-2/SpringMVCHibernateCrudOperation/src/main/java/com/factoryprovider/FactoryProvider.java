package com.factoryprovider;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {
	private static SessionFactory factory;
	
	private FactoryProvider() {
		
	}
	public static SessionFactory getSessionFactory() {
		try {
			if(factory==null) {
			factory=new Configuration().
			configure("hibernate.cfg.xml").buildSessionFactory();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return factory;
		
	}
public static void main(String[]arg) {
	System.out.println(getSessionFactory());
}
}
