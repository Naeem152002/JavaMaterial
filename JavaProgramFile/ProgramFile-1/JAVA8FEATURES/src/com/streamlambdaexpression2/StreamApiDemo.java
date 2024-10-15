package com.streamlambdaexpression2;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class StreamApiDemo {
	
	private static List<Employee>employees=null;
	
	
	static {
		
		Employee employee1=new Employee(1,"RamKumar","NOida",200000.00);
		
		Employee employee2=new Employee(2,"ShyamKumar","GrNOida",34999.00);
		
		Employee employee3=new Employee(3,"Praveen Tripathi","GKP",560000.00);
		
		Employee employee4=new Employee(4,"Ram","idida",500000.00);
		
		Employee employee5=new Employee(5,"ShivaKumar","Agara",900000.00);
		
		Employee employee6=new Employee(6,"RamAvatar","Hardoi",600000.00);
		
		Employee employee7=new Employee(7,"Kumar","Lucknow",500000.00);
		
		Employee employee8=new Employee(8,"RKumar","kanpur",100000.00);
		
		
		employees=List.of( employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8);
		
	}
	public  static void main(String args[]) {
		
		
		employees.stream().filter(t->t.getName().startsWith("R")).forEach(System.out::println);
		
		
		employees.stream().filter(t->t.getSalary()>=500000).forEach(System.out::println);
		
		
		List<String>Names=employees.stream().map(t->t.getName().toUpperCase()).collect(Collectors.toList());
		
		System.out.println(Names);
		
		
		List<Double>Salary=employees.stream().map(t->t.getSalary()).collect(Collectors.toList());
		System.out.println(Salary);
		
		
		Double Sal=employees.stream().map(t->t.getSalary()).findFirst().orElseThrow();
		System.out.println(Sal);
		
		
		Double Sa=employees.stream().map(t->t.getSalary()).reduce((num1, num2)->num1+num2).get();
		System.out.println(Sa);
	
		
		Double Sar=employees.stream().map(t->t.getSalary()).reduce(Double::sum).get();
		System.out.println(Sar);
		
		Double Sary=employees.stream().filter(t->t.getSalary()>200000).map(t->t.getSalary()).reduce(Double::sum).get();
		System.out.println(Sary);
		
		
	
//		Employee maxSalaryEmployee = employees.stream()
//		        .max((o1, o2) -> ((Integer) o1.getSalary()).compareTo((Integer) o2.getSalary()))
//		        .get();
//

		Employee maxSalaryEmployee = employees.stream()
		        .max(Comparator.comparing(Employee::getSalary)).
		        orElseThrow(NoSuchElementException::new);
		System.out.println(maxSalaryEmployee);
		        
		List<Employee>list = employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary)).
				collect(Collectors.toList());
		System.out.println(list);
		
		
		List<Employee>list2 = employees.stream().limit(4)
		.collect(Collectors.toList());
		System.out.println(list2);
		
		
		List<Employee>list3 = employees.stream().skip(3)
				.collect(Collectors.toList());
		System.out.println(list3);
		
		
		employees.stream().map(t->t.getSalary()+t.getSalary()).forEach(System.out::println);
		
	}
	
	
	
	

}
