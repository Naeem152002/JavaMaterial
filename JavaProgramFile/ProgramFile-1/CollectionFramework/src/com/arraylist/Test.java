package com.arraylist;

import java.util.ArrayList;

public class Test {
	public static void main(String args[]) {
		
		ArrayList arraylist=new ArrayList<>();
		arraylist.add("sanjay");
		arraylist.add("sanjay");
		arraylist.add("123");
		arraylist.add("456");
		arraylist.add("sanjay");
		arraylist.add(4, "hi");
		
		System.out.println(arraylist);
		
		System.out.println(arraylist.size());
		System.out.println(arraylist.isEmpty());
		System.out.println(arraylist.listIterator());
		System.out.println(arraylist.contains(123));
		
		ArrayList arraylist2=new ArrayList<>(arraylist);

		arraylist2.add("123");
		arraylist2.add("Robert");
		arraylist2.retainAll(arraylist);//second ke common data ko 
		//remove kr dega 
		System.out.println(arraylist2);
		arraylist2.addAll(arraylist);
		System.out.println(arraylist2);
		
		arraylist2.removeAll(arraylist);
		System.out.println(arraylist2);//remove all common data 
		
		
		
	}}

		
		

		


		


		


		






