package com.tenhibernate.TenHibernateProject;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//    Question q=new Question();
//    q.setQname("what is java");
//    List<String>a=new ArrayList<>();
//    a.add("java is programming");
//    q.setAnswers(a);
//    Set<String>s1=new HashSet<>();
//    s1.add("this is correct");
//    q.setExamples(s1);
//    Map<String,String>m=new HashMap<>();
//    m.put("a", "s1");
//    q.setQa(m);
//    	
    	try {
        Configuration cf=new Configuration().configure() ;
       SessionFactory sf= cf.buildSessionFactory();
     System.out.println(sf);
//       Session s=sf.openSession();
//       s.beginTransaction();
//       s.save(q);
//       s.getTransaction().commit();
    
    }
    	catch(Exception e) {
    		e.printStackTrace();
    	}
}
}