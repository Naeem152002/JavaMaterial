package com.joinmapcallection.HibernateJoinMapCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entities.Question;
import com.factoryprovider.FactoryProvider;

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
    	List<String>answers=new ArrayList<>();
    	answers.add("java is programming languange");
    	q.setAnswers(answers);
    	List<String>as=new ArrayList<>();
    	as.add("java is object oriented programming languange");
    	q.setAs(as);
    	Set<String>examples=new HashSet<>();
    	examples.add("java is support realworld");
    	q.setExamples(examples);
    	Map<String,String>qa=new HashMap<>();
    	qa.put("what is java","java is programming languange");
    	q.setQa(qa);
    	
    	try {
    	SessionFactory sf=FactoryProvider.getSessionFactory();
    	Session s=sf.openSession();
    	s.beginTransaction();
    	s.save(q);
    	s.getTransaction().commit();
    	
        System.out.println( "Hello World!" +"sf");
    }
    	catch(Exception e) {
    		e.printStackTrace();
    	}
}
}