package com.streamapi;

import java.util.stream.Stream;

public class Test3 {
	public static void main (String[]args) {
		
		Stream.iterate(1, e->e+1)
		.filter(e->e%5==0).limit(23)
		.forEach(System.out::println);
	}

}
