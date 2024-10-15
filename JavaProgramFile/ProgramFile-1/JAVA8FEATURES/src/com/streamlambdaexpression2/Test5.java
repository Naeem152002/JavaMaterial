package com.streamlambdaexpression2;

import java.util.Arrays;
import java.util.List;

public class Test5 {
	public static void main(String args[]) {
	
	
	List<String>stringList=Arrays.asList("hello","hi","ram","hi","shayam","mohan");
	long count=stringList.stream().count();
	System.out.println(count);
	
	stringList.stream().distinct().forEach(System.out::println);
	
	
	stringList.stream().distinct().map(t->t.concat("849")).forEach(System.out::println);
	
	
	
	
}
}