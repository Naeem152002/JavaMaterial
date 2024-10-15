package com.practice2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 

public class Main {

	public static void main(String[] args)  
		{
		ApplicationContext applicationContext=new  AnnotationConfigApplicationContext(JavaConfig.class) ;            
		
		Employee  employee=applicationContext.getBean("employee",Employee.class);
		Address  address=applicationContext.getBean("address",Address.class);
        address.setCity("hardoi");
        address.setState("up");
        address.setCountry("india");
		employee.setName("rahul");
		employee.setAge(34);
		System.out.println(employee);
		
		
	}

}
