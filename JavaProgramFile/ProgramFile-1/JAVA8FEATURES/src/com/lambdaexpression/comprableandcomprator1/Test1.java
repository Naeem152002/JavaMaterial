package com.lambdaexpression.comprableandcomprator1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
public static void main(String args[]) {
	List<Integer>list=new ArrayList<>();
	list.add(9);
	list.add(19);
	list.add(91);
	list.add(39);
	list.add(49);
	
	Collections.sort(list,(a,b)-> b-a);
	System.out.println(list);
	
	
}
}
