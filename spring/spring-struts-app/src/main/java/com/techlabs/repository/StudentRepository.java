package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;
@Repository("studentRepo")
public class StudentRepository {
	
	private Student s1,s2,s3;
	private List<Student> studentList=new ArrayList<Student>();
	
	public StudentRepository() {
		s1=new Student("abhishek",26);
		s2=new Student("deepak",27);
		s3=new Student("shekhar",28);
		addStudent(s1);
		addStudent(s2);
		addStudent(s3);
		System.out.println("repo created");
	}
	
	public void addStudent(Student s) {
		studentList.add(s);
	}
	
	public List<Student> getStudent(){
		return studentList;
	}
}
