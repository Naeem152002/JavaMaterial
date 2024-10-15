package com.streamlambdaexpression1;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream5 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(0);
		list.add(6);
		list.add(2);
		list.add(17);
		list.add(17);
		
		List<Integer> list2 = list.stream().map(a->a+a).collect(Collectors.toList());
		System.out.println(list2);
	
		
		Integer integer = list.stream().min((a,b)->a.compareTo(b)).get();
		
		System.out.println(integer);
		
		Integer integer1 = list.stream().max((a,b)->a.compareTo(b)).get();
		
		System.out.println(integer1);
		
		
		
		
		
		
		
		
//		
//		Set<Integer> list2 = list.stream().filter(j->j>6).collect(Collectors.toSet());
//		System.out.println(list2);
//		
//		List<String> names=List.of("rahul","Aman","surya","ram");
//	     
//	     List<String> newString=names.stream().filter(e->e.startsWith("r")).collect(Collectors.toList());
//	     System.out.println(newString);
//	     
//	     names.forEach(e->System.out.println(e));
//	     names.forEach(e->System.out.println(e.toUpperCase()));
//	     
//	     names.stream().forEach(System.out::println);
		}
}
