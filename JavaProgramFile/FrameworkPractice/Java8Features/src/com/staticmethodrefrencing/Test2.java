package com.staticmethodrefrencing;

import java.util.function.BiFunction;

class Arithimitic{
	public static int add(int a ,int b) {
		return a+b;
	}
	
	public static float multi(int a ,float b) {
		return a*b;
	}
	
	public static float sub(float a ,float b) {
		return a-b;
	}
	
}


public class Test2 {
	public static void main(String[]args) {
		
		BiFunction<Integer,Integer,Integer>ad=Arithimitic::add;
System.out.println(ad.apply(7,8));

BiFunction<Integer,Integer,Float>mu=Arithimitic::multi;	
System.out.println(mu.apply(8, 9));
BiFunction<Integer,Integer,Float>ms=Arithimitic::sub;	
System.out.println(ms.apply(8, 9));
	}

}
