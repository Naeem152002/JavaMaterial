package com.arraylists;

import java.util.ArrayList;

public class Test3 {
	//binary Search
	public static void reverseArray(ArrayList<Integer>list) {
		int start=0;
		int end=list.size()-1;
		while(start<end) {
			int temp=list.get(start);
			list.set(start, list.get(end));
			list.set(end, temp);
			start++;
			end--;
		}
		
	}
	public static void main(String[]args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(56);
		list.add(89);
		list.add(36);
		list.add(45);
		list.add(88);
		//System.out.println(list);
		reverseArray(list);
		System.out.println(list);
	}

}