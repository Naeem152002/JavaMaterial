package com.strings;

public class Test {
	public static boolean palindrome(String str) {
		int n=str.length();
		for(int i=0;i<n/2;i++) {
			if(str.charAt(i)==str.charAt(n-1-i)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[]args) {
		String str="racecar";
		System.out.println(palindrome(str));
	}

}
