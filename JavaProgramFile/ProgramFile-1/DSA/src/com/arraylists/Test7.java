package com.arraylists;

import java.util.ArrayList;

public class Test7 {
	//sorted Array
	public static boolean pairSum1(ArrayList<Integer>list,int target) {
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)+list.get(j)==target) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[]args) {
	ArrayList<Integer>list=new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(7);
	System.out.println(pairSum1(list, 7));
	
}}