package com.arrays;

public class Test5 {
	public static void pairsArray(int a[]) {
		//Tc=nsqure
		int tp=0;
		for(int i=0;i<a.length;i++) {
			int curr=a[i];
			for(int j=i+1;j<a.length;j++) {
				System.out.print("("+curr+","+a[j]+")");
				tp++;
			}
			System.out.println();
		}
		System.out.println("Total pairs"+tp);
	}
	
	public static void main(String[]args) {
		int a[]= {2,3,5,10,34,25};
		pairsArray(a);
}
}