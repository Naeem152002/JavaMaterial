package com.sorting;
//Linear Search
public class Test11 {
	
	public static int linearSearch(int numbers[]) {
		int max=numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(max<numbers[i]) {
				max=numbers[i];
	}
		}
		return max;}
	public static void main(String[]args) {
		int numbers[]= {2,4,6,8,10,12,14,16};
		int index=linearSearch(numbers);
		System.out.println(index);
		}
		
}
