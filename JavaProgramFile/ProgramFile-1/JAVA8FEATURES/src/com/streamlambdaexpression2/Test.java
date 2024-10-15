package com.streamlambdaexpression2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;
import java.util.Set;


public class Test {
	public static void main(String args[]) {
		Stream<Object>empty=Stream.empty();
		
		empty.forEach(e->System.out.println(e));
		
		
		String data[]= {"jeshan","gufran","mohan"};
		Stream<String>of=Stream.of(data);
		of.forEach(e->System.out.println(e));
		
		//System.out.println(of.count()); immutable hota hain
		
		//Stream<Object>stream=Stream.builder().build();
		
		
		int x[]= {38,49,34};
		IntStream stream2=Arrays.stream(x);
		stream2.forEach(e->System.out.println(e));
		
		
		List<Integer>list=new ArrayList<>();
		list.add(23);
		
		list.add(28);
		
		list.add(20);
		
		list.add(24);
		
		Stream<Integer>stream3=list.stream();
		
		Stream<String>stream4=Stream.of("hello","hi","bye","bye");
		stream4.forEach(System.out::println);
		
		
		
		
		
	List<String>asList=Arrays.asList("Java","andoid","automation");
	Stream<String>stream5=asList.stream();
	
	Collection<String>collection=Arrays.asList("Java","andoid","automation");
	Stream<String>stream6=collection.stream();
		
	
	Set<String>set=new HashSet<>(collection);
	
	Stream<String>stream7=set.stream();
	
	set.forEach(System.out::println);
	
	
		
		
		}	}


