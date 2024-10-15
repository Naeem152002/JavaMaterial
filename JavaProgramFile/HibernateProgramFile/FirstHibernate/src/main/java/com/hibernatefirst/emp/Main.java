package com.hibernatefirst.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Main {
public static void main(String args[]) {
	
	Emp e=new Emp();
	e.setName("Rahul");
	e.setAddress("Agra");
	try {
		
		Configuration configuration=new Configuration();
		configuration.configure("hathi.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	session.save(e);
	session.getTransaction().commit();
}
	catch(Exception e1) {
		e1.printStackTrace();
	}
}
}