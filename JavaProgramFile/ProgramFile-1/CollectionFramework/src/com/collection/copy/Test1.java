package com.collection.copy;


import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test1 {

	public static void main(String arg[]) {
		CopyOnWriteArrayList copyonArrayList =  new CopyOnWriteArrayList();
		copyonArrayList.add("1");
		copyonArrayList.add("2");
		copyonArrayList.add("3");
		
		Iterator i=  copyonArrayList.iterator();
		
		while(i.hasNext()) {
			copyonArrayList.add("4");
			System.out.println(i.next());
		}
		
//		copyonArrayList.add("4");
//		System.out.println(copyonArrayList);
	}
}
