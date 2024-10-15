package com.instancemethodrefrencing;

import java.util.function.BiFunction;

public class Test1 {
	
	public void sayLable() {
		System.out.println("sayLable hi hello");
	}
	public int add(int a,int b) {
		return a+b;
	}
	public static void main(String[]args) {
		Thread t=new Thread(new Test1()::sayLable);
		t.start();
		
		BiFunction<Integer,Integer,Integer>ad=new Test1()::add;
		System.out.println(ad.apply(8, 9));
	}

}
