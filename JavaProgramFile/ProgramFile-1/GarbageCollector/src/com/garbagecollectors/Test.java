package com.garbagecollectors;

public class Test {
	
	public void show() {
		System.out.println("how are you");
	}
	
	@Override
	public void finalize() {
		System.out.println("Garbage Collection");
	}
	
	public static void main(String[]args) {
		Test t1=new Test();
		Test t2=new Test();
		
		Test t3=new Test();
		new Test().show();//this work only once 
		
		t1=null;//jvm work when unused object
		t2=null;
		
		System.gc();
		Runtime.getRuntime().gc();
		
	}

}
