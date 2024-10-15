package com.instancemethodrefrencing;

interface I{
	void show();
}
class A{
	public void say() {
		System.out.println("say hi hello");
	}
}
public class Test {
	
	public static void main(String[]args) {
		I i=new A()::say;
		i.show();
		
		A a=new A();
		
		I i1=a::say;
		i1.show();
	}

}
