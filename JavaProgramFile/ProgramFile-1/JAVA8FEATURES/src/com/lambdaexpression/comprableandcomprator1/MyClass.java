package com.lambdaexpression.comprableandcomprator1;

import java.util.Comparator;

public class MyClass implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}

}
