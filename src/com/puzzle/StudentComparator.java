package com.puzzle;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.id>o2.id?1:o1.id<o2.id?-1:0;
//		return o1.name.compareTo(o2.name);
	}

}
