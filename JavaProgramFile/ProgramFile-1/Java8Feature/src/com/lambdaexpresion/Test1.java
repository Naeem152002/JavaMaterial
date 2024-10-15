package com.lambdaexpresion;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Test1 {
	
	public static void main(String[]args) {
		List<Integer>list=new ArrayList<Integer>();
		
		list.add(8);
		list.add(9);
		list.add(89);
		list.add(78);
		
		Consumer<Integer>con=s->System.out.println(s);
		
		list.forEach(p->System.out.println(p));
		
		
		List<Integer>result=list.stream().filter(p->p>78).collect(Collectors.toList());
		System.out.println(result);
		
		
		list.forEach(con);
		list.forEach((Consumer<? super Integer>) new Test1());
	}

}
