package com.instancemethodrefrencing;
interface B{
	void show();
}
interface B1{
	void info(String name);
}

public class Test2 {
	Test2(){
		System.out.println("constructor is test2");
	}
	Test2(String name){
		System.out.println("constructor is name");
	}
	public static void main(String[]args) {
		
		B b=Test2::new;
		b.show();
		B1 b2=Test2::new;
		b2.info("hello");
		
		
	}

}
