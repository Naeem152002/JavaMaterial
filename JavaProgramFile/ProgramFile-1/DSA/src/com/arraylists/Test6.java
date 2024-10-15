package com.arraylists;

import java.util.ArrayList;

public class Test6 {
	//2 pointers
	//Tc-n
	public static void maxWater(ArrayList<Integer>list) {
		int maxWater=0;
		int lp=0;
		int rp=list.size()-1;
		while(lp<rp) {
				int height=Math.min(list.get(lp), list.get(rp));
				int width=rp-lp;
				int currWater=height*width;
				maxWater=Math.max(maxWater, currWater);
				
				if(lp<rp) {
					lp++;
				}else {
					rp--;
				}
			}
		System.out.println(maxWater);
	}
	public static void main(String[]args) {
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
	}

}
