package com.functionalinterface.lambdaexpression1;

import java.util.*;
import java.util.function.Consumer;

public class Test11 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> con = s->System.out.println(s);
		Consumer<Integer> printConsumer = s -> System.out.println(s);
		
	//	add(int a ,int b)
		List<String> list = new ArrayList<>();
		list.add("abhi");
		list.add("ram");
		list.add("shayam");
		list.add("raman");
		list.add("daksh");
		list.forEach(new Test12());
		List<Integer> listint = new ArrayList<>();
		
		listint.add(1);
		listint.add(2);
		listint.add(3);
		listint.add(4);
		listint.add(5);
		listint.forEach(printConsumer);
		list.forEach(con);
		
		
		///////////////////////////Pridicate consumer 
		

            
          //  printConsumer.accept("Hello, world!"); 
		

	}

}


