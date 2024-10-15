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
    	person.setName("rohan");
       Student student=new Student("BCA", 10000);
       student.setName("ram");
       Employee employee=new Employee("CA", 15000);
       employee.setName("Moksh");
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
