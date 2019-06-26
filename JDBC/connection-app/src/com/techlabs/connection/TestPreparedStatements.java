package com.techlabs.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestPreparedStatements {

public static void main(String args[]) {
	Connection conn = null;
	Scanner sc=new Scanner(System.in);
	try {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		conn = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav?" + "user=root&password=root");
		System.out.println("enter Dept No:");
		String deptno=sc.nextLine();
		PreparedStatement st = conn.prepareStatement("select * from dept where deptno=?");
		st.setString(1, deptno);
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			System.out.println(
					"deptno->" + rs.getInt(1) + " dname->" + rs.getString(2) + " location->" + rs.getString(3));
		}
		conn.close();
	} catch (Exception e) {
	}
}
}
