package com.arraylists;

import java.util.ArrayList;

public class Test5 {
	// Tc- n squre
	public static void maxWater(ArrayList<Integer>list) {
		int maxWater=0;
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				int height=Math.min(list.get(i), list.get(j));
				int width=j-i;
				int currWater=height*width;
				maxWater=Math.max(maxWater, currWater);
			}
		}
		System.out.println(maxWater);
	}
	
	public static void main(String[]aargs){
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(1);
		list.add(8);
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(8);
		list.add(3);
		list.add(7);
		maxWater(list);
		
	}}


