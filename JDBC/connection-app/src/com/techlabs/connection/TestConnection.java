package com.techlabs.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String args[]) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			System.out.println("conn:"+conn.getClass());
			System.out.println("server:"+conn.getMetaData().getURL());
			System.out.println("database:"+conn.getCatalog());
			System.out.println("user:"+conn.getMetaData().getUserName());
			conn.close();
		} catch (Exception ex) {
			
		}

	}
}
