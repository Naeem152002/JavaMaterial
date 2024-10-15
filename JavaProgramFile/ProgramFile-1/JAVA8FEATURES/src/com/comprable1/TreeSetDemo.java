package com.comprable1;


import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet treeSet=new TreeSet();
		Student student1=new  Student(4,"Ram","Bhopal");
		Student student2=new  Student(1,"Raman","Datia");
		Student student3=new  Student(7,"Shyam","Jaipur");
		Student student4=new  Student(2,"Moksh","Punjab");
		Student student5=new  Student(0,"Shubh","Agra");
		treeSet.add(student1);
		treeSet.add(student2);
		treeSet.add(student3);
		treeSet.add(student4);
		treeSet.add(student5);
		System.out.println(treeSet);
	}
}
