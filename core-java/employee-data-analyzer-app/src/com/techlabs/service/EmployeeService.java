package com.techlabs.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.techlabs.business.Employee;
import com.techlabs.dataaccess.ILoadable;

public class EmployeeService {

	private Set<Employee> testSet;
	public EmployeeService(ILoadable obj) {
		testSet= obj.readData();

	}

	public Employee getMaxSalaryEmployee() {      
		double max=0;
		Employee m=null;
		for(Employee e:testSet) {
			if(e.getSalary()>max) {
				max=e.getSalary();
				m=e;
			}
		}
		return m;
	}

	public Map<String, Integer> getDesignationBasedCount() {
		HashMap<String, Integer> designationTypeMap = new HashMap<String, Integer>();
		for (Employee e : testSet) {
			if (designationTypeMap.containsKey(e.getEmpDesignation())) {
				designationTypeMap.put(e.getEmpDesignation(), designationTypeMap.get(e.getEmpDesignation()) + 1);
			} else {
				designationTypeMap.put(e.getEmpDesignation(), 1);
			}
		}
		return designationTypeMap;
	}

	public Map<Integer, Integer> getDepartmentNumberWiseCount() {
		HashMap<Integer, Integer> deptNoMap = new HashMap<Integer, Integer>();
		for (Employee e : testSet) {
			if (deptNoMap.containsKey(e.getDepartmentNumber())) {
				deptNoMap.put(e.getDepartmentNumber(), deptNoMap.get(e.getDepartmentNumber()) + 1);
			} else {
				deptNoMap.put(e.getDepartmentNumber(), 1);
			}
		}
		return deptNoMap;
	}

}
