package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entities.Emp;
import com.factoryprovider.FactoryProvider;

public class Main {
	public static void main(String[]args) {
		
		Emp e=new Emp();
		e.setName("Naeem");
		e.setEmail("naeemkuraishi@gmail.com");
		SessionFactory sf=FactoryProvider.getSessionFactory();
		System.out.println(sf);
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();		
		
	}

}
