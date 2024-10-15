package com.comprator1;


import java.util.Comparator;

import com.comprable1.Student;

public class SortingLogic implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

	

}

