package com.techlabs.employeepolymorphism;

public class Manager extends Employee {

	private double houseAllowance;
	private double travelAllowance;
	private double dearnessAllowance;

	public Manager(int empId, String name, double basicPay) {
		super(0, name, basicPay);
	}

	public double getHouseAllowance() {
		houseAllowance = basicPay*0.5;
		return houseAllowance;
	}
	
	public double getTravelAllowance() {
		travelAllowance =  basicPay*0.4;
		return travelAllowance;
	}
	
	public double getDearnessAllowance() {
		dearnessAllowance =basicPay*0.3;
		return dearnessAllowance;
	}

	@Override
	public double calculateAnnualSalary() {
		
		double annualSalary = (basicPay + getHouseAllowance() + getTravelAllowance() + getDearnessAllowance())*12;
		return annualSalary;
	}
	@Override
	public void salarySlip() {
		Manager e=new Manager(getEmployeeId(),getName(),getBasicPay());
		Print.printAnnualSlip(e);
		System.out.print(" House Allowance:"+e.getHouseAllowance());
		System.out.print(" Travel Allowance:"+e.getTravelAllowance());
		System.out.print(" Dearness Allowance:"+e.getDearnessAllowance());
	}

}
