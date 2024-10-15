package com.arrays;

public class Test {
	
	public static int linearSearch(int a[],int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key){
				return i;
			}
		}
		return -1;
		
		
	}
public static void main(String[]args) {
	
	int a[]= {2,4,6,8,10,12,14};
     int key=15;
     
     System.out.println(linearSearch(a, key));
	
}
}
