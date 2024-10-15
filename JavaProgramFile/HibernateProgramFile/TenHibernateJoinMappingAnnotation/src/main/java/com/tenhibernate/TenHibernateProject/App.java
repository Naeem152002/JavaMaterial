package com.tenhibernate.TenHibernateProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Question;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	Question q=new Question();
    	q.setQname("what is java");
    	List<String>answers=new ArrayList<>();
    	answers.add("java is programming languange");
    	q.setAnswers(answers);
    	Set<String>examples=new HashSet<>();
    	examples.add("java is support realworld");
    	q.setExamples(examples);
    	Map<String,String>qa=new HashMap<>();
    	qa.put("what is java","java is programming languange");
    	q.setQa(qa);
    	
    	try {
        Configuration cf=new Configuration().configure() ;
       SessionFactory sf= cf.buildSessionFactory();
       System.out.println(sf);
       Session s=sf.openSession();
       s.beginTransaction();
       s.save(q);
       s.getTransaction().commit();
    
    }
    	catch(Exception e) {
    		e.printStackTrace();
    	}
}
}