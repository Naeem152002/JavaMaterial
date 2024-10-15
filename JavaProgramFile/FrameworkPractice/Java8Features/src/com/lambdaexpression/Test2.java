package com.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
interface k{
	public String say(String name);
	
}

public class Test2 {
	
	public static void main(String[]args) {
		
		List<String>list=new ArrayList<>();
		list.add("Rohit");
		list.add("Ankit");
		list.add("rahul");
		list.add("Welcome");
		
		list.forEach(
				(n)->System.out.println(n)
				);
		
		k k1=(name)->(name);
			System.out.println(k1.say("hello"));
		}
		
		
	}


