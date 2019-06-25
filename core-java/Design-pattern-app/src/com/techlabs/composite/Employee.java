package com.techlabs.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;

	public Employee(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public int getSalary() {
		return salary;
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public void add(Employee e) {
		subordinates.add(e);
	}

	public void remove(Employee e) {
		subordinates.remove(e);
	}

	public String toString() {
		return "employee name-> " + name + " dept-> " + dept + " salary-> " + salary ;
	}
}
