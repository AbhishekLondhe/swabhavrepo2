package com.techlabs.assignment;

public class Emp {

	private int id;
	private int salary;
	
	public Emp(int id,int salary)
	{
		this.id=id;
		this.salary=salary;
	}
	public Emp(int id)
	{
		this(id,5000);
	}
	public int getId(){
		return id;
	}
	public int getSalary() {
		return salary;
	}
}
