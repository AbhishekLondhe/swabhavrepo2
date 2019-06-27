package com.techlabs.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestTransaction {
static	Connection conn = null;
	public static void main(String args[]) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			conn.setAutoCommit(false);
			PreparedStatement stVendor = conn.prepareStatement("update vendor set balance=balance-5000 WHERE ID=101");
			stVendor.executeUpdate();
			PreparedStatement stCustomer = conn.prepareStatement("update customers set balance=balance+5000 WHERE ID=1");
			stCustomer.executeUpdate();
			conn.commit();
			
		} catch (Exception e) {
			conn.rollback();
		}
	}	
}
