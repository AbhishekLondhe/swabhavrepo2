package com.techlabs.collection.set;

import java.util.Comparator;

public class Student implements Comparable<Student>{

	private int rollNo;
	private int standard;
	private String firstName;
	private String lastName;

	public Student(int rollNo, int standard, String firstName, String lastName) {
		this.rollNo = rollNo;
		this.standard = standard;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public int getStandard() {
		return standard;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || this.getClass() != obj.getClass())
			return false;
		Student s = (Student) obj;
		return ((s.rollNo == this.rollNo) && (s.standard == this.standard));
	}

	@Override
	public int hashCode() {
		return rollNo;
	}
	
	

	@Override
	public String toString() {
		return "roll no:" + this.getRollNo() + " std:" + this.getStandard() + " firstname:" + this.getFirstName()
				+ " last name:" + this.getLastName();
	}



	@Override
	public int compareTo(Student o) {
		return this.getRollNo()-o.getRollNo();
	}


}

