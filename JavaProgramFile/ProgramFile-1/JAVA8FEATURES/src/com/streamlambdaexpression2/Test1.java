package com.streamlambdaexpression2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Test1 {
	public static void main(String args[]) {
		
		//without stream
		List<Integer>list=new ArrayList<>();
		list.add(34);
		list.add(94);
		list.add(74);
		list.add(54);
		list.add(37);
		list.add(39);
		list.add(36);
		
		
		Iterator<Integer>i=list.iterator();
		while(i.hasNext()) {
			
			Integer ir=(Integer)i.next();
			if(ir%2==0) {
				System.out.println(ir);
			}
		}
		
	}

}
