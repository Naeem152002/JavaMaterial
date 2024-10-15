package com.arrays;

public class Test7 {
	//Tc-ncube
	public static  void subArraysSum(int a[]) {
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			int start=i; 
			for(int j=i;j<a.length;j++) {
				int end=j;
				
				for(int k=start;k<=end;k++) {
					sum=sum+a[k];
				}
					if(max<sum) {
						max=sum;
					}
				}
				
			}
		System.out.println("Total sum subarray "+sum);
	}
	public static void main(String[]args) {
		int a[]= {2,3,5,10,34,25};
		subArraysSum(a);
	}
}