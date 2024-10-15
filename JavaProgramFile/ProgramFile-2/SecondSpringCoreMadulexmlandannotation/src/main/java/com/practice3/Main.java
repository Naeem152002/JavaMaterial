package com.practice3;


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
        employee.setName("Naeem");
        employee.setAge(22);
        System.out.println(employee);
		employee.show();
		
		
	}

}
