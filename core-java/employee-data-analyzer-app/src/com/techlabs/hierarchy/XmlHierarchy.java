package com.techlabs.hierarchy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Set;

import com.techlabs.business.Employee;
import com.techlabs.dataaccess.ILoadable;

public class XmlHierarchy {
	private Employee president;
	private Set<Employee> employeeSet;

	public XmlHierarchy(ILoadable iLoad) {
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
	public String displayHierarchy() {
		CEOHierarchy();
		return president.display();
		
	}

	public void writing() {
        try {
            File textFile = new File("C:Users/DELL/Desktop/write.txt");
            FileOutputStream is = new FileOutputStream(textFile);
            OutputStreamWriter osw = new OutputStreamWriter(is);    
            Writer w = new BufferedWriter(osw);
            w.write(displayHierarchy());
            w.close();
        } catch (IOException e) {
            System.err.println("error");
        }
    }
}
