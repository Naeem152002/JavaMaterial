package com.arraylist;
import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayList4{ 
	public static void main(String[] args) 
	{
		
		ArrayList arrayList=new ArrayList();
 
		arrayList.add(12);
		arrayList.add(19);
		arrayList.add(-12);
		arrayList.add(-1);
		 
		
		// ListIterator listIterator = arrayList.listIterator(arrayList.size());ye kewal forward dirction main chalega 
			
		 ListIterator listIterator = arrayList.listIterator(); 
			System.out.println("in farward.........");
			 while(listIterator.hasNext())
			 {
				 System.out.println(listIterator.next());
			  
			 }
			
		 
		System.out.println("in backward.......");
		 while(listIterator.hasPrevious())
		 {
			 System.out.println(listIterator.previous());
		  
		 }
		
	}

}
