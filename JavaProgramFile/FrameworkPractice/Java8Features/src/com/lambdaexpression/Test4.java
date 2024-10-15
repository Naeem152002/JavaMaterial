package com.lambdaexpression;

interface L{
	public String say();
}

public class Test4 {
	public static void main(String[]args) {
		L l1=()->("hello");
		System.out.println(l1.say());
	}

}
