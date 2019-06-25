package com.techlabs.dataaccess;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import com.techlabs.business.Employee;

public class DiskLoader implements ILoadable {

	Employee employee;
	Set<Employee> employees = new HashSet<>();

	@Override
	public Set<Employee> readData() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Data/dataFile.txt"));
			String line = reader.readLine();
			while ((line = reader.readLine()) != null) {
				line = line.replaceAll("\\s+", "");
				line = line.replaceAll("'", "");
				line = line.replaceAll("NULL", "0");
				String[] details = line.split(",");
				
				int empId, departmentNo, managerId;
				String empName, empDesignation, dateOfJoining;
				double salary, commission;
				empId = Integer.parseInt(details[0]);
				empName = details[1];
				empDesignation = details[2];
				managerId = Integer.parseInt(details[3]);
				dateOfJoining = details[4];
				salary = Double.parseDouble(details[5]);
				commission = Double.parseDouble(details[6]);
				departmentNo = Integer.parseInt(details[7]);
				
				employee = new Employee(empId, empName, empDesignation,
						managerId, dateOfJoining, salary, commission,
						departmentNo);
				employees.add(employee);}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return employees;
	}
}
