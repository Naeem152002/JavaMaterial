package com.eighthibernate.EightHibernateMappingProject;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.user.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	User u=new User();
    	u.setName("Naeem");
    	 List<String> newAddresses = new ArrayList<>();
         newAddresses.add("789 Pine Rd");
         newAddresses.add("101 Maple Blvd");
         u.setAddress(newAddresses);
    	
    	try {
        Configuration cf=new Configuration().configure();
       SessionFactory sf= cf.buildSessionFactory();
       System.out.println(sf);
      Session s= sf.openSession();
      s.beginTransaction();
      s.save(u);
      s.getTransaction().commit();
    }catch(Exception e) {
    	e.printStackTrace();
    	}
    }
}
