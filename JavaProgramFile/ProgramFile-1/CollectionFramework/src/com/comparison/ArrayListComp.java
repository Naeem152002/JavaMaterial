package com.comparison;


import java.util.ArrayList;

public class ArrayListComp {
	public static void showInsertComp(ArrayList  arrayList) {
		Timer.startTimer();
		   for(int i = 1;i<100000;i++) {
			arrayList.add(i);
		   }

		 Timer.stopTimer();
	}
	public static void showSearchComp(ArrayList arrayList) {
		 Timer.startTimer();
		 for(int i = 0;i<arrayList.size();i++) {
			   arrayList.get(i);
		 }
		 
		 Timer.stopTimer();
		 
		 
	}
 public static void main(String[] args) {
	 ArrayList arrayList = new ArrayList();
	 showInsertComp(arrayList);
	 showSearchComp(arrayList);
 
}
 
}
