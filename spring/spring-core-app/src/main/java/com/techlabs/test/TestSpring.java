package com.techlabs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.techlabs.services.StudentService;

public class TestSpring {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService srv=(StudentService) context.getBean("studentService",StudentService.class);
		System.out.println("srv:"+srv.getStudentList().size());
		StudentService srv1=(StudentService) context.getBean("studentService",StudentService.class);
		System.out.println("srv1:"+srv1.getStudentList().size());
	}
}
