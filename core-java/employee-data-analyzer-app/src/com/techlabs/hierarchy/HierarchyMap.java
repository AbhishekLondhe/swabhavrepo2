package com.techlabs.hierarchy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.techlabs.business.Employee;
import com.techlabs.dataaccess.ILoadable;

public class HierarchyMap {


	private Set<Employee> empSet;
	private Map<Integer, List<Employee>> employeeDetails;
	private List<Employee> reportee;
	private List<Employee> employeeList;
	public HierarchyMap(ILoadable iload) {
		empSet = iload.readData();
		employeeDetails = new HashMap<Integer, List<Employee>>();
		reportee = new ArrayList<Employee>();
		employeeList=new ArrayList<Employee>(empSet);
	}
	public Set<Employee> getEmpSet() {
		return empSet;
	}
	public Map<Integer, List<Employee>> getEmployeeDetails() {
		return employeeDetails;
	}
	public List<Employee> getReportee() {
		return reportee;
	}
	
	public void addReportee() {
		/*for(Employee emp:employeeList) {
			System.out.println(emp);
		}*/
		for(int i=0;i<employeeList.size();i++) {
			if(employeeList.get(i).getManagerId()==0) {
				continue;
			}
			if(employeeList.get(i).getManagerId()==employeeList.get(i).getEmpId()) {
				reportee.add(employeeList.get(i));
			}
		}
		System.out.println("reportee size:"+reportee.size());
		for(Employee emp:reportee) {
			System.out.println("Emp id:"+emp.getEmpId()+"Manager id"+emp.getManagerId());
		}
	}
	
	public void addEmployee() {
		for(Employee emp:empSet) {
			employeeDetails.put(emp.getEmpId(), reportee);
		}
	}
	
	public void displayEmployee() {
		for (Map.Entry<Integer,List<Employee>> entry : employeeDetails.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue());
	}
}
