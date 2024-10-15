package com.sorting;

public class Test13 {
	public static void reverseArray(int a[]){
		int start=0;
		int end=a.length-1;
		
		while(start<end) {
			int temp=a[end];
			a[end]=a[start];
			a[start]=temp;
			start++;
			end--;
		}
		

	}
	public static void main(String[]args) {
		int a[]= {2,3,5,10,34,25};
		reverseArray(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	
	}

}
