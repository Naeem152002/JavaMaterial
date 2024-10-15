package com.streamlambdaexpression1;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestStream1 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(0);
		list.add(6);
		list.add(2);
		list.add(17);
		
//		list
//		.stream()
//		.sorted()
//		.forEach((a)->System.out.println(a));

		Stream<Integer> stream = list.stream();
	long count = stream.count();
		System.out.println(count);
		//Stream sorted = stream.sorted();
		//sorted.forEach((a)->System.out.println(a));
		
		
		}
}
