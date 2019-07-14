package com.techlabs.repository;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Customer;
import com.techlabs.model.Transaction;

public class BankRepository {
	static Connection conn;

	public void addCustomerToDB(Customer customer) throws SQLException {

		try {
			String pattern = "yyyy-MM-dd";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			String date = simpleDateFormat.format(new Date());
			System.out.println(date);
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			conn.setAutoCommit(false);
			String sql = "INSERT INTO swabhav.BANK_MASTER (name,password,balance) VALUES(?,?,?)";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, customer.getPassword());
			preparedStatement.setDouble(3, customer.getBalance());
			preparedStatement.executeUpdate();

			String sql1 = "INSERT INTO swabhav.BANK_TRANSACTION (name,date,type,amount) VALUES(?,?,?,?)";
			preparedStatement = conn.prepareStatement(sql1);
			preparedStatement.setString(1, customer.getName());
			preparedStatement.setString(2, date);
			preparedStatement.setString(3, "D");
			preparedStatement.setDouble(4, customer.getBalance());
			preparedStatement.executeUpdate();
			conn.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			conn.rollback();
		}

	}

	public Customer getpassword(String userName) throws Exception {
		Connection conn = null;
		Customer customer = null;
		try {
			System.out.println("in admin repo");
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			PreparedStatement st = conn.prepareStatement("SELECT * FROM BANK_MASTER WHERE NAME=?");
			st.setString(1, userName);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				customer = new Customer(rs.getString(1), rs.getString(2), rs.getDouble(3));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return customer;
	}

	public List<Transaction> getTransaction(String userName) {
		Connection conn = null;
		Transaction t = null;
		List<Transaction> transaction = new ArrayList<Transaction>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			PreparedStatement st = conn.prepareStatement("SELECT * FROM BANK_TRANSACTION WHERE NAME=?");
			st.setString(1, userName);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				t = new Transaction(rs.getString(1), rs.getDate(2), rs.getString(3), rs.getDouble(4));
				transaction.add(t);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return transaction;
	}

	public void doTransaction(String name, String amount, String transaction) throws SQLException {
		Double oldBalance = 0.0;

		try {
			String pattern = "yyyy-MM-dd";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

			String date = simpleDateFormat.format(new Date());
			System.out.println(date);
			ResultSet rs = null;
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			conn.setAutoCommit(false);

			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			String sql = "SELECT name, password, balance FROM swabhav.BANK_MASTER where name = ?";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setString(1, name);
			rs = preparedStatement.executeQuery();
			while (rs.next()) {
				oldBalance = rs.getDouble(3);

			}
			String query = "update swabhav.BANK_MASTER set balance = ? where name = ?";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			if (transaction.equalsIgnoreCase("deposite")) {
				preparedStmt.setDouble(1, Double.parseDouble(amount) + oldBalance);
			} else {
				preparedStmt.setDouble(1, oldBalance - Double.parseDouble(amount));
			}
			preparedStmt.setString(2, name);
			preparedStmt.executeUpdate();

			String sql1 = "INSERT INTO swabhav.BANK_TRANSACTION (name,date,type,amount) VALUES(?,?,?,?)";
			preparedStatement = conn.prepareStatement(sql1);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, date);
			if (transaction.equalsIgnoreCase("deposite")) {
				preparedStatement.setString(3, "D");
			} else {
				preparedStatement.setString(3, "W");
			}
			preparedStatement.setDouble(4, Double.parseDouble(amount));
			preparedStatement.executeUpdate();
			conn.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			conn.rollback();
		}

	}

}
