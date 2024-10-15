package com.arrays;

public class Test1 {
	public static int minNumber(int a[]) {
		int min=a[0];
		for(int i=1;i<a.length;i++) {
//			if(min>a[i]) {
//				min=a[i];
//			}
			min=Math.min(min, a[i]);
		}
		return min;
		
	}
	public static void main(String[]args) {
	int a[]= {2,4,6,8,10,12,14};
	System.out.println(minNumber(a));
}
}