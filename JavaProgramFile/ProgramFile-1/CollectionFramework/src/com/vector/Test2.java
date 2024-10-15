package com.vector;

import java.util.Vector;
public class Test2 
{
	public static void main(String[] args) 
	{	
		Vector vector=new Vector<>();
		
		vector.add(367);
		vector.add(37);
		vector.add(7);
		vector.add(7);
		 
	Vector vector1=new Vector<>();

		vector1.add(367);
		vector1.add(37);
		vector1.add(75);
		vector1.add(907);
	
		//vector1.removeAll(vector);
		vector1.retainAll(vector);
	
		System.out.println(vector1);
		
	}

}

