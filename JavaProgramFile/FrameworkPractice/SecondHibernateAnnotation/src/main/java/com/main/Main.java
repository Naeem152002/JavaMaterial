package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entities.User;
import com.factoryprovider.FactoryProvider;


public class Main {
	
	public static void main(String[]args) {
		User u=new User();
		u.setName("rahul");
		u.setEmail("email");
		
		
		SessionFactory sf=FactoryProvider.getSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();
		System.out.println("Sucessfully");
		
	}

}
