package com.lambdaexpression.comprableandcomprator1;


import java.util.Set;
import java.util.TreeSet;

public class Test2 {
public static void main(String args[]) {
	Set<Integer>s=new TreeSet<>();
	s.add(9);
	s.add(19);
	s.add(91);
	s.add(39);
	s.add(49);
	System.out.println(s);

	
	Set<Integer>s1=new TreeSet<>((a,b)-> b-a);
	s1.add(9);
	s1.add(19);
	s1.add(91);
	s1.add(39);
	s1.add(49);
	System.out.println(s1);

	
	
}
}



