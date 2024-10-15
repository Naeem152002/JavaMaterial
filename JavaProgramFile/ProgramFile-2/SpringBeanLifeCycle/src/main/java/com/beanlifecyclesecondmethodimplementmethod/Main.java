package com.beanlifecyclesecondmethodimplementmethod;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)  
		{
			
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext1.xml"); 
		
		Employee employee=applicationContext.getBean("emp",Employee.class);
		((AbstractApplicationContext) applicationContext).registerShutdownHook();
		System.out.println(employee);
		
		
	}

}

