package com.db;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {
	private static SessionFactory factory;
	
	private FactoryProvider() {
		
	}
	public static SessionFactory getSessionFactory() {
		try {
			if(factory==null) {
				Configuration cf=new Configuration();
				factory=cf.configure("hibernate.cfg.xml").buildSessionFactory();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return factory;

}
	
}