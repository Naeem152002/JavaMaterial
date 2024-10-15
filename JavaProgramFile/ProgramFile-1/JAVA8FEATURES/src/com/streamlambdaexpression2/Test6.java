package com.streamlambdaexpression2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test6 {
	public static void main(String args[]) {
		
		
		List<String>stringList=Arrays.asList("hello","hi","ram","hi","shayam","mohan");
		
		List<Integer>list=new ArrayList<>();
		list.add(34);
		list.add(94);
		list.add(74);
		list.add(54);
		list.add(37);
		list.add(39);
		list.add(36);
		
		
		Integer i=list.stream().max(Integer::compare).get();
		System.out.println(i);
		
		
		Integer i1=list.stream().max(Comparator.comparingInt(Integer::intValue)).orElse(null);
		System.out.println(i1);
		
		Integer i2=list.stream().min(Comparator.comparingInt(Integer::intValue)).orElse(null);
		System.out.println(i2);

		
		list.stream().sorted().forEach(System.out::println);
		
		
		
		
	
		
}
}