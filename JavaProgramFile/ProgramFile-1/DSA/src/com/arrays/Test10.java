package com.arrays;

public class Test10 {
	//using kedan,s algorthim
	//Tc-n
	
	public static void maxSumSubArrays(int a[]) {
		int sum=0;
		int max=Integer.MIN_VALUE;
		boolean check=true;
		for(int i=0;i<a.length;i++) {
			if(a[i]<=0) {
			check=false;	
			}
			
			sum=sum+a[i];
			if(sum<0) {
				sum=0;
			}
			max=Math.max(max, sum);
		}if(check) {
			System.out.println(0);
		}else {
		System.out.println(max);
	}
	}
	public static void main(String[]args) {
		int a[]= {1,-2,6,-1,3};
		maxSumSubArrays(a);
	}

}
