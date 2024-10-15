package com.abstractpattren;
interface Employee{
	
	int salary();
	String name();
}
class AndriodDevloper implements Employee{

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String name() {
		System.out.println("I am AndriodDevloper");
		return null;
	}
	
}
class WebDevloper implements Employee{

	@Override
	public int salary() {
		
		return 0;
	}

	@Override
	public String name() {
		System.out.println("I am WebDevloper");
		return null;
	}
	
}
abstract class EmployeeAbstractFactory{
	public abstract Employee createEmployee();
}
class EmployeeFactory{
	public static Employee getEmployee(EmployeeAbstractFactory factory) {
		
		return factory.createEmployee();
		
	}
}
class WebDevFactory extends EmployeeAbstractFactory{

	@Override
	public  Employee createEmployee() {
		// TODO Auto-generated method stub
		return new WebDevloper();
	}
	
}
class AndriodDevFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		// TODO Auto-generated method stub
		return new AndriodDevloper();
	}
	
}
public class Test1{
	
public static void main(String[]args) {
	Employee e=EmployeeFactory.getEmployee(new WebDevFactory());
	e.salary();
	e.name();
	
	Employee e1=EmployeeFactory.getEmployee(new AndriodDevFactory());
	e1.salary();
	e1.name();
	


}}


