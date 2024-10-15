package com.springwithautowiringwithoutbean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

public class Main {

	public static void main(String[] args)  
		{
			
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext4.xml"); 
		
		Employee  employee=applicationContext.getBean("emp",Employee.class);
		Address  address=applicationContext.getBean("address",Address.class);
        address.setCity("hardoi");
        address.setState("up");
        address.setCountry("india");
		employee.setName("rahul");
		employee.setAge(34);
		System.out.println(employee);
		
		
	}

}
