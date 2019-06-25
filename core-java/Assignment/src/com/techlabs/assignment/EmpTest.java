package com.techlabs.assignment;

public class EmpTest {

	public static void main(String args[]) {
		display(new Emp(10));
		display(new Emp(10,2000));
	}
	
	public static void display(Emp e)
	{
		System.out.println("id:"+e.getId());
		System.out.println("salary:"+e.getSalary());
	}
}
