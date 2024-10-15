package com.practice;

public class Test3 {
	String name,age;
	Test3(String name,String age){
		this.name=name;
		this.age=age;
	}
	Test3(Test3 t){
		name=t.name;
		age=t.age;
	}
	void show() {
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String args[]) {
		Test3 t=new Test3("Naeem","22");
		t.show();
		Test3 t1=new Test3(t);
		t1.show();
		
		
		
	}

}
