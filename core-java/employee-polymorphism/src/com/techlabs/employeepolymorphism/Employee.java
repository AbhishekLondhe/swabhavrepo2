package com.techlabs.employeepolymorphism;

public abstract class Employee {
	private int empId;
	private String name;
	protected double basicPay;
	private static int nextEmployeeId;
	
	static {
		nextEmployeeId=0;
	}

	public Employee(int empId, String name,double basicPay) {
		this.empId=nextEmployeeId+=1;
		this.name=name;
		this.basicPay=basicPay;
	}
	public int getEmployeeId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public double getBasicPay() {
		return basicPay;
	}
	
	public abstract double calculateAnnualSalary();
	public abstract void salarySlip();
}
