package com.comprator2usinglambdaexpression;


import java.util.Comparator;
import java.util.TreeSet;

import com.comprable1.Student;

public class TreeSetDemo {
	public static void main(String[] args) {
//		Comparator comparator=new SortById();
		//Sorting By name
//		TreeSet<Student> treeSet=new TreeSet<Student>((a,b)->a.getName().compareTo(b.getName()));
		
		//Sort by id
//		TreeSet<Student> treeSet=new TreeSet<Student>((a,b)->Integer.compare(a.getId(), b.getId()));
//		TreeSet<Student> treeSet=new TreeSet<Student>(Comparator.comparingInt(a->a.getId()));
		TreeSet<Student> treeSet=new TreeSet<Student>(Comparator.comparingInt(Student::getId));
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

