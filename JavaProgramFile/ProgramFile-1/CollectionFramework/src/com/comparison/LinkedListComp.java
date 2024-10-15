package com.comparison;


import java.util.LinkedList;

public class LinkedListComp {
	
	public static void showInsertComp(LinkedList linkedList) {
		Timer.startTimer();
		   for(int i = 1;i<100000;i++) {
			linkedList.add(i);
		   }

		 Timer.stopTimer();
	}
	public static void showSearchComp(LinkedList linkedList) {
		 
		 Timer.startTimer();
		 for(int i = 0;i<linkedList.size();i++) {
			   linkedList.get(i);
		 }
		 
		 Timer.stopTimer();
		 
	}

public static void main(String[] args) {
	LinkedList  linkedList  = new LinkedList();
showInsertComp(linkedList);
showSearchComp(linkedList);

}}


