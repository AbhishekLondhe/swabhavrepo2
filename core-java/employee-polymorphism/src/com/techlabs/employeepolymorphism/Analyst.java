package com.techlabs.employeepolymorphism;

public class Analyst extends Employee{

	
	private double perkAllowance;
	public Analyst(int empId,String name,Double basicPay)
	{
		super(0,name,basicPay);
	}
	
	public double getPerkAllowance() {
		perkAllowance = basicPay*0.3;
		return perkAllowance;
	}

	@Override
	public double calculateAnnualSalary() {
		
		double annualSalary=(basicPay+getPerkAllowance())*12;
		return annualSalary;
	}

	@Override
	public void salarySlip() {
		Analyst e=new Analyst(getEmployeeId(),getName(),getBasicPay());
		Print.printAnnualSlip(e);
		System.out.println(" Perk Allowance:"+e.getPerkAllowance());	
		}

}
