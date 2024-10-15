package com.arraylist;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		Employee2 e = new Employee2("Rajesh","Delhi",22);
		Employee2 e1 = new Employee2("Mohan","Surat",23);
		Employee2 e2 = new Employee2("Jayesh","Bombay",24);
		
		al.add(e);
		al.add(e1);
		al.add(e2);
		Iterator iterator = al.iterator();
		while(iterator.hasNext())
		{
			Employee2 e4 =(Employee2)  iterator.next();
			e4.show();
			
		}
        	}

}

