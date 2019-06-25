package com.techlabs.employeepolymorphism;

public class Print {

	public static void printAnnualSlip(Employee e) {

		System.out.print("\nEMPLOYEE ID:" + e.getEmployeeId());
		System.out.print(" EMPLOYEE NAME:" + e.getName());
		System.out.print(" EMPLOYEE BALANCE:" + e.getBasicPay());
		System.out.println(" EMPLOYEE ANNUAL SALARY:"+e.calculateAnnualSalary());
	}
}
