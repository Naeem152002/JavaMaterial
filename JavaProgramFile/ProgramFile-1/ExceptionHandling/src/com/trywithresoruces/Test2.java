package com.trywithresoruces;
class MyClass implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("hello");
		
	}
	
}

public class Test2 {
	public static void main(String[]args) {
	try(MyClass m=new MyClass()) {
		
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}