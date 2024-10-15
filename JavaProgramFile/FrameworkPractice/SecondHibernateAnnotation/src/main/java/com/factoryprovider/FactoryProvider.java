package com.factoryprovider;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {
	public static SessionFactory factory;
	
	private FactoryProvider() {
		
	}
	public static SessionFactory getSessionFactory() {
		
		try {
			if(factory==null) {
				factory=new Configuration().configure().buildSessionFactory();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return factory;
		
	}
	
}
