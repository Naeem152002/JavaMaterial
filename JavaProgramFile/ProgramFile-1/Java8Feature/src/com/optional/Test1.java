package com.optional;

import java.util.Optional;

public class Test1 {
	public static void main(String[]args) {
		String[]str=new String[10];
		Optional<String>che=Optional.ofNullable(str[5]);
		if(che.isPresent()) {
			System.out.println(che);
		}else {
			System.out.println("value is null");
			//System.out.println(che);
		}
		
	}

}