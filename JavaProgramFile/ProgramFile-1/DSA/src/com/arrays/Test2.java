package com.arrays;

public class Test2 {
	public static int maxNumber(int a[]) {
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
		
	}
	public static void main(String[]args) {
	int a[]= {2,4,6,8,10,12,14};
	System.out.println(maxNumber(a));
}
}