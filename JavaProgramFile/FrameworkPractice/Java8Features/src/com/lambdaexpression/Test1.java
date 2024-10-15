package com.lambdaexpression;

interface J{
	public int add(int a,int b);
}
interface J1{
	public int multi(int a,int b);
}
public class Test1 {
	public static void main(String[]args) {
		
		J i=(a,b)->{
			return (a+b);
		};
		System.out.println(i.add(5, 9));
		
		
		J1 j=(a,b)->(a*b);
		System.out.println(j.multi(8, 8));
			
	}
	}


