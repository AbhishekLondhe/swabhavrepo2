package com.techlabs.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.Employee;

public class EmployeeRepository {

	public List<Employee> employees=new ArrayList<Employee>();

	public void loadData() {
		Connection conn = null;
		try {
			System.out.println("in load repo");
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			//Statement st=conn.createStatement();
			//ResultSet rs=st.executeQuery("select * from emp");
			PreparedStatement st = conn.prepareStatement("select * from emp");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				String mgr = rs.getString(4);
				String hiredate = rs.getString(5);
				String sal = rs.getString(6);
				String comm = rs.getString(7);
				int deptno = rs.getInt(8);
				employees.add(new Employee(empno, ename, job, mgr, hiredate, sal, comm, deptno));
				System.out.println("inside rs");
			}
			conn.close();
		} catch (Exception e) {
		}
	}

	public List<Employee> getData() {
		System.out.println("in get repo");
		loadData();
		return employees;
	}

}
