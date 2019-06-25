package com.techlabs.presentation;

import java.util.HashSet;
import java.util.Set;

import com.techlabs.business.Employee;
import com.techlabs.dataaccess.DiskLoader;
import com.techlabs.dataaccess.ILoadable;
import com.techlabs.dataaccess.WebLoader;
import com.techlabs.service.EmployeeService;

public class EmployeeTest {
	private static Set<Employee> set;

	public static void main(String args[]) {
		DiskLoader d = new DiskLoader();
		WebLoader w = new WebLoader();
		EmployeeService e = new EmployeeService(d);
		System.out.println("---maximum salary employee---");
		System.out.println(e.getMaxSalaryEmployee());
		System.out.println("---designation Types---");
		System.out.println(e.getDesignationBasedCount());
		System.out.println("---department Number---");
		System.out.println(e.getDepartmentNumberWiseCount());
	}

}
