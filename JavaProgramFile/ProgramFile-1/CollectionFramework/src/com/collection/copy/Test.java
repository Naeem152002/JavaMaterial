package com.collection.copy;


import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String arg[]) {
		ArrayList arraylist=new ArrayList();
		arraylist.add("1");
		arraylist.add("2");
		arraylist.add("3");
		
		Iterator i=  arraylist.iterator();
		
		while(i.hasNext()) {
			arraylist.add("4");
			
			System.out.println(i.next());
		}
}
}
