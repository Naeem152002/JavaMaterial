package com.arrays;

public class Test11 {
	public static void minSumSubArrays(int a[]) {
		int sum=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			if(sum>0) {
				sum=0;
			}
			min=Math.min(min, sum);
		}
		System.out.println(min);
	}
	
	public static void main(String[]args) {
		int a[]= {1,-2,6,-1,3};
		minSumSubArrays(a);
	}

}
