package com.arraylists;

import java.util.ArrayList;

public class Test8 {
	//sorted Array-ascending
	public static boolean pairSum1(ArrayList<Integer>list,int target) {
		int lp=0;
		int rp=list.size()-1;
			while(lp<rp) {
				if(list.get(lp)+list.get(rp)==target) {
					return true;
				}
				if(list.get(lp)+list.get(rp)<target){
					lp++;
			}else {
				rp--;
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
	System.out.println(pairSum1(list, 13));
	
}}
