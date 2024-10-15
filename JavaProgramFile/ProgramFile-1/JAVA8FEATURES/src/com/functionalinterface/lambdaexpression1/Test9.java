//for each method use lambda expression
package com.functionalinterface.lambdaexpression1;

import java.util.ArrayList;

public class Test9 {
public static void main(String args[]) {
	ArrayList<Integer> arraylist=new ArrayList<Integer>();
	arraylist.add(12);
	arraylist.add(34);
	arraylist.add(45);
	arraylist.add(89);
	
	for(Integer o:arraylist) {//for each loop
		System.out.println(o);
	}
	
	//for each method 
	arraylist.forEach((x)->System.out.println(x));

}
}
