package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	float salary;
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}
public class Test4 {
	
	public static void  main(String[]args) {
		
		List<Employee>employee=new ArrayList<Employee>();
		employee.add(new Employee(1,"Rahul",345567f));
		employee.add(new Employee(2,"Raj",345567f));
		employee.add(new Employee(3,"Rajkapoor",345567f));
		employee.add(new Employee(4,"Robert Jonio",345567f));
		
		List<Float>salary=employee.stream().filter(p->p.salary>7889f).map(p->p.salary).collect(Collectors.toList());
		System.out.println(salary);
		employee.stream().filter(p->p.salary>8373f).forEach(p->System.out.println(p.name));
		
		
		Float total=employee.stream().map(p->p.salary).reduce(0.0f,(sum, s)->sum+s); 
		System.out.println(total);
		
	}
	
	

}
