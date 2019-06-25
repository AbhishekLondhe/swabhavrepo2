package com.techlabs.college;

public class Student extends Person{

	private BranchType branch;

	public Student(int id, String address, String dob,BranchType branch) {
		super(id, address, dob);
		this.branch=branch;
	}
	
	public BranchType getBranch() {
		return branch;
	}
	
	@Override
	public void print() {
		Student s=new Student(getId(),getAddress(),getDob(),getBranch());
		System.out.print(" branch:"+s.getBranch());
	}
	
}
