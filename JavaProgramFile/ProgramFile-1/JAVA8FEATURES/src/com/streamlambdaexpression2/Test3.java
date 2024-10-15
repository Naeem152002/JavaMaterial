package com.streamlambdaexpression2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Test3{
	public static void main(String args[]) {
		
		//with stream
		List<Integer>list=new ArrayList<>();
		list.add(34);
		list.add(94);
		list.add(74);
		list.add(54);
		list.add(37);
		list.add(39);
		list.add(36);
		
		list.stream().filter(i->i<=74).forEach(System.out::println);
		
		List<Integer>collect=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(collect);
		
		
		List<String>stringList=Arrays.asList("hello","hi","ram","shayam","mohan");
		stringList.stream().filter(t->t.startsWith("h"))
		.forEach(System.out::println);
		
		List<String>stringList1=Arrays.asList("hello","hi","ram","shayam","mohan");
		stringList1.stream().filter(t->t.endsWith("m"))
		.forEach(System.out::println);
		
		
	
		List<String>stringList2=Arrays.asList("hello",null,"ram",null,"mohan");
		stringList2.stream().filter(t->t!=null)
		.forEach(System.out::println);
		
		List<String>stringList3=Arrays.asList("hello",null,"ram",null,"mohan");
		Set<String>set=stringList3.stream().filter(t->t!=null).collect(Collectors.toSet());
		System.out.println(set);
		
		

		
	}

}
