package com.springwithautowiringwithannotationbyconstructor;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

public class Main {

	public static void main(String[] args)  
		{
			
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext3.xml"); 
		
		Employee  employee=(Employee)applicationContext.getBean("emp");
        
		System.out.println(employee);
		
		
	}

}