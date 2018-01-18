package com.puzzle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student{
//	public class Student implements Comparable{
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	int id;
	String name;
	public static void main(String[] args) {

		Student s1 = new Student(1, "Ramesh");
		Student s2 = new Student(4, "Prakash");
		Student s3 = new Student(2, "Arjun");
		
		List<Student> stList = new ArrayList<>();
		stList.add(s1);
		stList.add(s2);
		stList.add(s3);
		Collections.sort(stList,new StudentComparator());
		
		for(Student s:stList){
			System.out.println(s);
		}
	}
/*	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s = (Student)o;
		return (this.id>s.id)?1:(this.id<s.id)?-1:0;
	}*/
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
