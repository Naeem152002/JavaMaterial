package com.arrays;

public class Test9 {
	//Tc-better -n sqaure
	public static  void maxSumSubArray(int a[]) {
		int sum=0;
		int max=Integer.MIN_VALUE;
		int prefix[]=new int[a.length];
		prefix[0]=a[0];
		for(int i=1;i<prefix.length;i++) {
			prefix[i]=prefix[i-1]+a[i];
		}
		for(int i=0;i<a.length;i++) {
			int start=i; 
			for(int j=i;j<a.length;j++) {
				int end=j;
				sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
				
					if(max<sum) {
						max=sum;
					}
				}
			
			}
		System.out.println("max sum "+max);
	}
	public static void main(String[]args) {
		//int a[]= {2,3,5,10,34,25};
		int a[]= {1,-2,6,-1,3};
		maxSumSubArray(a);
	}
}
