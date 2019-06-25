package com.techlabs.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

	public static void main(String args[]) {
		Set<Student> set=new LinkedHashSet<Student>();
		Student s1=new Student(101,10,"a","b");
		Student s2=new Student(101,10,"a","b");
		Student s3=new Student(102,20,"x","y");
		set.add(s1);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		System.out.println(set.size());
	}
}
