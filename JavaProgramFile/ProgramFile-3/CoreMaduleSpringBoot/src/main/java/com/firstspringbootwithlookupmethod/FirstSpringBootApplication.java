package com.firstspringbootwithlookupmethod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
	ApplicationContext applicationContext=SpringApplication.run(FirstSpringBootApplication.class, args);
	Employee emp1=applicationContext.getBean("employee",Employee.class);
	System.out.println(emp1.getAdr());
	System.out.println(emp1.getAdr());
	
	}

}
