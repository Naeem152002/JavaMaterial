package com.sorting;

public class Test7 {
	
	public static void main(String[]args) {
		int n =6; 
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
			
		}
		if(sum==n) {
			System.out.println("perfect Number");
		}else {
			System.out.println("perfect is not  Number");	
		}
		}
	}


