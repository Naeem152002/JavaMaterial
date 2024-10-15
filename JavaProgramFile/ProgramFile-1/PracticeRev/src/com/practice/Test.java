package com.practice;

public class Test {

	String s1;
	
	Test(String b){
		s1=b;
	}
	void show() {
		System.out.println(s1);
	}
//	public String toString() {
//		return s1;
//	}
	
	public static void main (String args[]) {
		Test t=new Test("Naeem");
		t.show();
		System.out.println(t);
		
		int i=t.hashCode();
		System.out.println(i);
		
		String hex=Integer.toHexString(i);
		System.out.println(hex);
		System.out.println(t.getClass().getName()+"@"+hex);
		
		
	}
	
	
}
