package com.staticmethodrefrencing;
interface M{
	public void show();
}
class A{
public static void saySamthing() {
	System.out.println("say samthing");
}
}
public class Test {
	public static void main(String[]args) {
		
		M m=A::saySamthing;
		m.show();
		
	}
	
	
	

}
