package com.trywithresoruces;

import java.io.FileInputStream;
import java.util.Scanner;

public class Test1 {
	
	public static void main(String[]args) {
		
		try (Scanner sc=new Scanner(System.in);FileInputStream fil=new FileInputStream("txt")){
			System.out.println("Enter Name");
			int n=sc.nextInt();
			System.out.println(n);
		}catch(Exception e) {
			
		}
		
		
	}

}
