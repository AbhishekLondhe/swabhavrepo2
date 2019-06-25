package com.techlabs.hierarchy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.techlabs.business.Employee;
import com.techlabs.dataaccess.ILoadable;

public class HierarchyBuilder {
	private Employee president;
	private Set<Employee> employeeSet;

	public HierarchyBuilder(ILoadable iLoad) {
		employeeSet = iLoad.readData();
	}

	public void CEOHierarchy() {
		for (Employee emp : employeeSet) {
			if(emp.getManagerId()==0) {
				president = emp;
				president.setLevel(0);
			}
			}
		EmployeeUnderCEO();
		}

	public void EmployeeUnderCEO() {
		for (Employee emp : employeeSet) {
			if (emp.getManagerId() == president.getEmpId()) {
				president.addSubordinates(emp);
				emp.setLevel(1);
			}
		}
		EmployeeUnderManager();
	}

	public void EmployeeUnderManager() {
		for (Employee CEOEmployee : president.getSubordinates()) {
			for (Employee emp : employeeSet) {
				if (emp.getManagerId() == CEOEmployee.getEmpId()) {
					CEOEmployee.addSubordinates(emp);
					emp.setLevel(2);
				}
			}
		}
		EmployeeUnderReportee();
	}

	public void EmployeeUnderReportee() {
		for (Employee CEOEmployee : president.getSubordinates()) {
			for(Employee ManagerEmployee:CEOEmployee.getSubordinates()) {
				for (Employee emp : employeeSet) {
					if (emp.getManagerId() == ManagerEmployee.getEmpId()) {
						ManagerEmployee.addSubordinates(emp);
						emp.setLevel(3);
					}
				}
			}
		}		
	}	
	public void displayHierarchy() {
		CEOHierarchy();
		president.display();
	}
	
}