package com.firstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
	ApplicationContext applicationContext=SpringApplication.run(FirstSpringBootApplication.class, args);
	Employee emp1=applicationContext.getBean("employee",Employee.class);
	Employee emp2=applicationContext.getBean("employee",Employee.class);
	Address ad1=applicationContext.getBean("address",Address.class);
	Address ad2=applicationContext.getBean("address",Address.class);
	System.out.println(emp1);
	System.out.println(emp2);
	System.out.println(ad1);
	System.out.println(ad2);
	
	
	}

}
