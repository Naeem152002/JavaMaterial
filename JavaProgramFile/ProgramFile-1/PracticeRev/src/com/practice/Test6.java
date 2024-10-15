package com.practice;

public class Test6 {
	public static void show() throws Exception {
		 throw new Exception("hi");
		// System.out.println("hello");
	}
	public static void main(String argsp[]) throws Exception {
//		show();
		Test6 t=new Test6();
		
		{
			throw new Exception("hello");
		}
	}

}
