package com.arrays;

public class Test6 {
	public static void subArrays(int a[]) {//toalt subarrays=n(n+1)/2;
		int ts=0;
		for(int i=0;i<a.length;i++) {
			int start=i;
			for(int j=i;j<a.length;j++) {
				int end=j;
				for(int k=start;k<=end;k++) {
					System.out.print(a[k]+" ");
					ts++;
					
				}
				System.out.println();
			}
		}
		System.out.println("Total subarrays"+ts);
	}
	public static void main(String[]args) {
		//int a[]= {2,3,5,10,34,25};
		int a[]= {1,-2,6,-1,3};
		subArrays(a);
	}
}
