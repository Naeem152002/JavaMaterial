package com.comprator2;


import java.util.Comparator;

import com.comprable1.Student;

public class SortById implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getId()>o2.getId()) {
			return 1;
		}else if(o1.getId()<o2.getId()){
			return -1;
		}else
		return 0;
	}

		
}

