package com.techlabs.collection.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String args[]) {
		TreeSet<Student> set=new TreeSet<Student>(new SortByFirstName());
		Student s1=new Student(107,12,"shekhar","patil");
		Student s2=new Student(104,10,"abhishek","londhe");
		Student s3=new Student(103,8,"yogita","more");
		Student s4=new Student(106,7,"deepak","gupta");
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println("Sorted Student List by ---------------first name:------------- ");
		for(Student s:set) {
			System.out.println(s);
		}
		
		set=new TreeSet<Student>(new SortByLastName());
		set.add(s1);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println("Sorted Student List by ---------------last name:------------- ");
		for(Student s:set) {
			System.out.println(s);
		}
		
		set=new TreeSet<Student>(new SortByStd());
		set.add(s1);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println("Sorted Student List by ---------------standard------------- ");
		for(Student s:set) {
			System.out.println(s);
		}
	
	}
}
