package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList3
{
	public static void main(String[] args) {
		
		ArrayList arrayList=new ArrayList();
	//	List arrayList=new ArrayList(2000);
		//List arrayList1=new ArrayList(arrayList);
		arrayList.ensureCapacity(9);// matalb 10 se kam hain to ye nahi badayegi agar hum 25 krde ensure capacity to 10 se badi hain to ab
		// 25 ho jayegi 
		arrayList.add(12);
		arrayList.add(19);
		arrayList.add(-12);
		arrayList.add(-1);
		
//		arrayList.add(true);
//		arrayList.add(true);
//		arrayList.add(true);
//		arrayList.add(true);
//		arrayList.add(true);
//		arrayList.add(true);
//		arrayList.add(true);
//		arrayList.add(true);
//		
		
		  Iterator iterator = arrayList.iterator();
		   
		  while(iterator.hasNext())
		  {
			 Integer i=(Integer)iterator.next();
		  if(i.intValue()<0)
		  {
			  iterator.remove();
		  }
		  else
		  {

		     System.out.println(i);
		  }}
		
		
		 
		
		
	}

}
