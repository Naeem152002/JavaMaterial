package com.arraylist;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e = new Employee("Rajesh","Delhi",22);
		Employee e1 = new Employee("Mohan","Surat",23);
		Employee e2 = new Employee("Jayesh","Bombay",24);
		
		
		al.add(e);
		al.add(e1);
		al.add(e2);
		
		Iterator<Employee> iterator = al.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			
			
		}
        	}

}

