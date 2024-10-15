package com.practice;

public class Test1 {
	void show(Test1 t) {
		System.out.println("show");
		
	}
	void info() {
		show(this);
	System.out.println("info");	
	}
	
public static void main(String args[]) {
	Test1 t=new Test1();
	t.info();
}
}
