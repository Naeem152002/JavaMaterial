package com.arrays;

public class Test8 {
	//Tc-ncube-prefix Array
	public static  void maxSum(int a[]) {
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			int start=i; 
			for(int j=i;j<a.length;j++) {
				int end=j;
				sum=0;
				for(int k=start;k<=end;k++) {
					sum=sum+a[k];
				}System.out.println(sum);
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
		maxSum(a);
	}
}
