package com.techlabs.employeepolymorphismtest;

import com.techlabs.employeepolymorphism.*;
public class EmployeeTest {

	public static void main(String args[]) {
		Employee d = new Developer(5, "abc", 4000);
		Employee m = new Manager(2, "abc", 2000);
		Print p=new Print();
		d.salarySlip();
		m.salarySlip();
	}
}
