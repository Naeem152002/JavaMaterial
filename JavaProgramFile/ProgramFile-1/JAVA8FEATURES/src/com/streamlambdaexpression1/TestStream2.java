package com.streamlambdaexpression1;


	import java.util.ArrayList;
	import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
	

	public class TestStream2 {
		public static void main(String[] args) {
			List<Integer> list=new ArrayList<Integer>();
			list.add(1);
			list.add(0);
			list.add(6);
			list.add(2);
			list.add(17);
			list.add(17);
	List<Integer> list2 = list.stream().filter(j->j%2==0).collect(Collectors.toList());
		System.out.println(list2);
		List<Integer> list3 = list.stream().filter(j->j>6).collect(Collectors.toList());
		System.out.println(list3);
		Set<Integer> set = list.stream().filter(j->j>6).collect(Collectors.toSet());
		System.out.println(set);
				


		}
	}
