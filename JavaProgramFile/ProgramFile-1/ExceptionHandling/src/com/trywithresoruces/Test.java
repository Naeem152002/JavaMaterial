package com.trywithresoruces;

import java.util.Scanner;

public class Test {
	
	public static void main(String[]args) {
		Scanner sc=null;
		try {
		sc=new Scanner(System.in);
		System.out.println("Enter Name");
		int n=sc.nextInt();
		System.out.println(n);
		}catch(Exception e) {
			
		}
		finally {
			sc.close();
		}
		
	}

}
