package com.tableperhirerchywithoutannotation.TablePerHirechywithoutannotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Person p=new Person();
    	p.setName("Khalid");
    	
    	Employee e1=new Employee();
    	e1.setName("Naeem");
    	e1.setJob("software Engineer");
    	e1.setSalary("400000");
    	
    	Student s1=new Student();
    	s1.setName("Gufran");
    	s1.setFess("80000");
    	s1.setCourse("B.Tech");
    	try {
       Configuration cf=new Configuration().configure();
      SessionFactory sf=cf.buildSessionFactory();
      System.out.println(sf);
      Session s=sf.openSession();
      s.beginTransaction();
      s.save(p);
      s.save(e1);
      s.save(s1);
      s.getTransaction().commit();
    }
    	catch(Exception e) {
    		e.printStackTrace();
    	}
}
}