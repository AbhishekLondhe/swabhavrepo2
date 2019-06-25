package com.techlabs.business;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String empName;
	private String empDesignation;
	private int managerId;
	private String dateOfJoining;
	private double salary;
	private double commission;
	private int departmentNumber;
	private int level;
	private List<Employee> subordinates;
	


	public Employee() {
		
	}
	
	public Employee(int empId, String empName, String empDesignation, int managerId, String dateOfJoining,
			double salary, double commission, int departmentNumber) {
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.managerId = managerId;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.commission = commission;
		this.departmentNumber = departmentNumber;
		subordinates=new ArrayList<Employee>();
	}

	@Override
	public String toString() {
		return "id:" + empId + " name:" + empName + " designation:" + empDesignation + " manager id:" + managerId
				+ " date of joining:" + dateOfJoining + " salary:" + salary + " commission:" + commission
				+ " dept number:" + departmentNumber;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public int getManagerId() {
		return managerId;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public double getCommission() {
		return commission;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		else if (o == null || this.getClass() != o.getClass())
			return false;
		Employee emp = (Employee) o;
		return (this.getEmpId() == emp.getEmpId() && this.getManagerId() == emp.getManagerId());
	}

	
	@Override
	public int hashCode() {
		return empId;
	}
	@Override
	public int compareTo(Employee o) {

		return this.getEmpId()-o.getEmpId();
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}	
	
	
	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public void addSubordinates(Employee emp) {
		subordinates.add(emp);
	}
	
	public String display() {
		for(int i=0;i<5*level;i++) {
			System.out.print(" ");
		}
		System.out.print("");
		System.out.println("EmpID:"+empId+" Designation:"+empDesignation+""
				+ " Employee Name"+empName+">");
		for(Employee emp:this.getSubordinates()) {
			emp.display();
		}
		return "hello";
	}
}
