package com.techlabs.dataaccess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import com.techlabs.business.Employee;

public class WebLoader implements ILoadable {

	Employee employee;
	Set<Employee> employees = new HashSet<>();

	@Override
	public Set<Employee> readData() {
		try {
			URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			while ((line = in.readLine()) != null) {
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
				employees.add(employee);
			}
			in.close();
		} catch (MalformedURLException e) {
			System.out.println("Malformed URL: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("I/O Error: " + e.getMessage());
		}
		return employees;
	}
}
