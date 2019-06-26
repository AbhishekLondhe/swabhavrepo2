package com.techlabs.services;

import java.util.List;

import com.techlabs.model.Employee;
import com.techlabs.repository.EmployeeRepository;

public class EmployeeService {

	
	EmployeeRepository empRepo=new EmployeeRepository();
	
	public List<Employee> getEmployees(){
		System.out.println("in service");
		return empRepo.getData();
		
	}
}
