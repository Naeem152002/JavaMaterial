package com.arraylists;

import java.util.ArrayList;

public class Test4 {
	public static void main(String[]args) {
		ArrayList<Integer>list1=new ArrayList<Integer>();
		list1.add(89);
		list1.add(78);
		list1.add(67);
		list1.add(56);
		list1.add(45);
		ArrayList<Integer>list2=new ArrayList<Integer>();
		list2.add(67);
		list2.add(56);
		list2.add(45);
		list2.add(89);
		list2.add(78);
		ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
		list.add(list1);
		list.add(list2);
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(int i=0;i<list.size();i++) {
			ArrayList<Integer>curr=list.get(i);
			for(int j=0;j<curr.size();j++) {
				System.out.print(curr.get(j)+" ");
			}
			System.out.println();
		}}
	}


