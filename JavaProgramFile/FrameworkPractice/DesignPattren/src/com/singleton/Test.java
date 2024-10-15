package com.singleton;

public class Test {
	
	private static Test t;
	
	private Test() {
		
	}
	
	public static  Test getTest() {
		if(t==null) {
			t=new Test();
		}
		return t;
		
	}
	
	public static void main(String[]args) {
		
		Test x1=Test.getTest();
		Test x2=Test.getTest();
		
		System.out.println(x1);
		System.out.println(x2);
	}

}
