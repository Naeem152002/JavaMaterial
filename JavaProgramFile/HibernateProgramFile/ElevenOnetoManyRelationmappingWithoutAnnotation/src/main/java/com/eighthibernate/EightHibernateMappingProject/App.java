package com.eighthibernate.EightHibernateMappingProject;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Answer;
import com.entities.Question;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Question q=new Question();
    	q.setQname("what is java");
    	
    	
    	Answer a1=new Answer();
    	a1.setAnswername("java is programming languange");
    	a1.setPostedBy("naeem");
    	
    	Answer a2=new Answer();
    	a2.setAnswername("java is oops support");
    	a2.setPostedBy("gufran");
    	q.setAnswers(Arrays.asList(a1,a2));
    	
    	System.out.println(q);
    	
    	try {
        Configuration cf=new Configuration().configure();
       SessionFactory sf= cf.buildSessionFactory();
       System.out.println(sf);
    Session s= sf.openSession();
    s.beginTransaction();
     s.save(q);
      s.getTransaction().commit();
    }catch(Exception e) {
    	e.printStackTrace();
    	}
    }
}
