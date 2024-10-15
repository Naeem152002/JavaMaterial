package com.TablePerClass;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;
import com.bean.Person;
import com.bean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Person person=new Person();
    	person.setName("ram");
    	
       Student student=new Student();
       student.setCourse("BCA");
       student.setFees(1000);
       student.setName("shyam");
       
       Employee employee=new Employee();
       employee.setJob("ca");
       employee.setSalary(19000);
       employee.setName("rohan");
       try {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(person);
		session.save(student);
		session.save(employee);
		transaction.commit();
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
}
