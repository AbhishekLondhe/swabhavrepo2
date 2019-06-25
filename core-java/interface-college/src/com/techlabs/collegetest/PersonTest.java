package com.techlabs.collegetest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.techlabs.college.*;
public class PersonTest {

	
	public static void main(String args[]) {
		College college=new College();
		Student student[]=new Student[2];
		Student student1=new Student(5,"cst","5 mar",BranchType.EXTC);
		Student student2=new Student(8,"wadala","4 aug",BranchType.IT);
		Professor pro[]=new Professor[2];
		pro[0]=new Professor(3,"virar","5 may",7000);
		pro[1]=new Professor(4,"dadar","3 june",4000);
		college.addStudents(student1);
		college.addStudents(student2);
		college.addProfessor(pro);
		printDetails(college);
		
	}
	
	public static void printDetails(College clg) {
		List student=new LinkedList();
		List professor=new LinkedList();
		student =clg.getStudents();
		professor=clg.getProfessors();
		for(Iterator i =student.iterator(); i.hasNext();) {
			Student s=(Student) i.next();
			System.out.println(s.getId());
			System.out.println(s.getAddress());
			System.out.println(s.getDob());
			System.out.println(s.getBranch());
		}
		
		for(Iterator i=professor.iterator(); i.hasNext();) {
			Professor p=(Professor) i.next();
			System.out.println(p.getId());
			System.out.println(p.getAddress());
			System.out.println(p.getDob());
			System.out.println(p.getSalary());
		}
	}
}
