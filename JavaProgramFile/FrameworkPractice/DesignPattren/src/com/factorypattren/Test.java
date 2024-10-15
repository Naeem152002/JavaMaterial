package com.factorypattren;

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
		System.out.println("Andriod Devloper");
		return null;
	}
	
}
class WebDevloper implements Employee{

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String name() {
		System.out.println("Web Devloper");
		return null;
	}
	
}
class EmployeeFactory{
	public static Employee getEmployee(String name) {
		if(name.trim().equalsIgnoreCase("Andriod Devloper")) {
			return new AndriodDevloper();
		}else if(name.trim().equalsIgnoreCase("WebDevloper Devloper")) {
		return new WebDevloper();
		}
		else {
		return null;
}
	}
public class Test {
	public static void main(String[]args) {
		Employee e=EmployeeFactory.getEmployee("Andriod Devloper");
		e.name();
		System.out.println(e);
	}

}}
