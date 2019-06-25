package com.techlabs.college;

public class Professor extends Person implements ISalariedEmployee{

	private double basicSalary;
	
	public Professor(int id, String address, String dob,double basicSalary) {
		super(id, address, dob);
		this.basicSalary=basicSalary;
	}
	
	@Override
	public double calculateSalary() {
		this.basicSalary=this.basicSalary*ta;
		return this.basicSalary;
	}
	
	public double getSalary() {
		return basicSalary;
	}
	
	@Override
	public void print() {
		Professor p=new Professor(getId(),getAddress(),getDob(),getSalary());
		System.out.print(" basic salary:"+p.getSalary());
		System.out.print(" travelling allowance:"+p.calculateSalary());
	}
	
}
