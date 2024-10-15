package com.firstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.firstspringboot.address.Address;
import com.firstspringboot.employee.Employee;

@SpringBootApplication
public class SpringBootCoreModuleApplication {

	public static void main(String[] args) {
		ApplicationContext container=SpringApplication.run(SpringBootCoreModuleApplication.class, args);
		Employee emp=container.getBean("employee",Employee.class);
		emp.setName("Name");
		emp.setAge("63");
		Address add=container.getBean("address",Address.class);
		emp.setAddr(add);
		add.setCity("Hardoi");
		add.setState("UP");
		add.setCountry("India");
		System.out.println(emp);
		
	}

}
