package com.techlabs.employeepolymorphism;

public class Developer extends Employee {

	private double performAllowance;

	public Developer(int empId, String name, double basicPay) {
		super(0, name, basicPay);
	}

	public double getPerformAllowance() {
		performAllowance = basicPay * 0.4;
		return performAllowance;
	}

	@Override
	public double calculateAnnualSalary() {

		double annualSalary = (basicPay + getPerformAllowance())*12;
		return annualSalary;
	}

	@Override
	public void salarySlip() {
		Developer e=new Developer(getEmployeeId(),getName(),getBasicPay());
		Print.printAnnualSlip(e);
		System.out.print(" Perform Allowance:"+e.getPerformAllowance());	
		}
}
