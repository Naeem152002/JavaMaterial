package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
public static void main(String args[]) {
	ArrayList arraylist=new ArrayList();
	arraylist.add("hello");
	arraylist.add("hi");
	
	
	for(int i=0;i<arraylist.size();i++) {
		System.out.println(arraylist.get(i));
		
		
	Iterator iterator=arraylist.iterator();	
	
	while(iterator.hasNext()) {
		
			System.out.println(iterator.next());
		}
}
}}
