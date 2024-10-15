package com.lambdaexpression.comprableandcomprator1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
public static void main(String args[]) {
	Emp e1=new Emp(1,"rahul", "agra");
	Emp e2=new Emp(5,"raj", "delhi");
	Emp e3=new Emp(2,"ankit", "mumbai");
	Emp e4=new Emp(4,"vinod", "chennai");
	
	List<Emp>e=new ArrayList<Emp>();
	e.add(e1);
	e.add(e2);
	e.add(e3);
	e.add(e4);
	
	Collections.sort(e,(a,b)-> b.getId()-a.getId());
	e.forEach((x)->System.out.println(x));

	}
}
