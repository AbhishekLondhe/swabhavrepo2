package com.techlabs.actions;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.services.StudentService;

public class StudentAction implements Action {
	private int count=0;
	@Autowired
	public StudentService studentService;
	
	public String execute() throws Exception {
		count=studentService.getStudentList().size();
		return this.SUCCESS;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}


}
