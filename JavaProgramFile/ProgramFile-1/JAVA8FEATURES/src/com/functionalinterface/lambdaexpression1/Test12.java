package com.functionalinterface.lambdaexpression1;

import java.util.function.Consumer;

public class Test12 implements Consumer<String> {

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println("DATA >>>>> ---"+t);
		
		
	}

}

