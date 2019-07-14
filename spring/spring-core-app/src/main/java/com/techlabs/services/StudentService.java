package com.techlabs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Student;
import com.techlabs.repository.StudentRepository;

@Service("studentService")
public class StudentService {
	@Autowired
	private StudentRepository sr;
	
	public StudentService() {
		System.out.println("service created");
	}
	
	public List<Student> getStudentList(){
		return sr.getStudent();	
	}
}
