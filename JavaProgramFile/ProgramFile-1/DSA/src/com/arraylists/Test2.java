package com.arraylists;

import java.util.ArrayList;

public class Test2 {
	
	public static void main(String[]aargs) {
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(8);
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		list.remove(0);
		list.set(2, 6);
		System.out.println(list);
		System.out.println(list.contains(5));
		
	}

}
