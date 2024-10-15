package com.streamlambdaexpression2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Test2{
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
		
		list.stream().filter(i->i%2==0).forEach(System.out::println);
		
		List<Integer>collect=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(collect);
		

		
	}

}
