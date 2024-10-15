package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee1{
	int id;
	String name;
	float salary;
	public Employee1(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class Test5 {
	
	public static void main(String[]args) {
		List<Employee1>employee=new ArrayList<Employee1>();
		employee.add(new Employee1(1,"Rahul",345567f));
		employee.add(new Employee1(2,"Raj",345567f));
		employee.add(new Employee1(3,"Rajkapoor",345567f));
		employee.add(new Employee1(4,"Robert Jonio",345567f));
		Double total=employee.stream().collect(Collectors.summingDouble(p->p.salary));
		System.out.println(total);
		Employee1 e=employee.stream().max((a,b)->a.salary>b.salary?1:-1).get();
		System.out.println(e);
		Employee1 e2=employee.stream().min((a,b)->a.salary>b.salary?1:-1).get();
		System.out.println(e2);
		Long c=employee.stream().filter(p->p.salary>3000).count();
		System.out.println(c);
		
		
	}

	

}
