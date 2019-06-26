package com.techlabs.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestStatement {
	public static void main(String args[]) {
		Connection conn = null;
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav?" + "user=root&password=root");
			Statement st = conn.createStatement();
			System.out.println("enter Dept No:");
			String num=sc.nextLine();
			ResultSet rs = st.executeQuery("select * from dept where deptno="+num);
			while (rs.next()) {
				System.out.println(
						"deptno->" + rs.getInt(1) + " dname->" + rs.getString(2) + " location->" + rs.getString(3));
			}
			conn.close();
		} catch (Exception e) {
		}
	}
}
