package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test9 {
	
	public static void main(String[]args) {
		Integer a[]= {4,2,5,7,6,89};
		//Arrays.sort(a,0,3);
		List<Integer>list=new ArrayList<>();
		list.add(98);
		list.add(89);
		list.add(2);
		list.add(99);
		Arrays.sort(a,Collections.reverseOrder());
		
		Collections.sort(list);
		Collections.reverse(list);
	
		System.out.println(list);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
