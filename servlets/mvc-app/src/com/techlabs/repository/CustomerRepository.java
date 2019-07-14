package com.techlabs.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.CardType;
import com.techlabs.model.Customer;



public class CustomerRepository {
	private List<Customer> customers=new ArrayList<Customer>();
	CardType card;
	public void loadData() {
		Connection conn = null;
		try {
			System.out.println("in load repo");
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			PreparedStatement st = conn.prepareStatement("SELECT * FROM CUSTOMERS");
			ResultSet rs = st.executeQuery();
			System.out.println("rs"+rs);
			while (rs.next()) {
				System.out.println("inside rs");
				String firstname=rs.getString(1);
				String lastname=rs.getString(2);
				String id=rs.getString(3);
				String date=rs.getString(4);
				double balance=rs.getDouble(5);
				String dbCard= rs.getString(6);
				if(dbCard.equalsIgnoreCase("credit")) {
					card=CardType.credit;
				}
				else {
					card=CardType.debit;
				}
				customers.add(new Customer(id,firstname,lastname,date,balance,card));
			}
			conn.close();
		} catch (Exception e) {
		}
	}

	public List<Customer> getData() {
		System.out.println("in get repo");
		return customers;
	}	

	public void deleteData(String custId) {
		Connection conn = null;
		try {
			System.out.println("in delete repo");
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			PreparedStatement st = conn.prepareStatement("DELETE FROM CUSTOMERS WHERE ID=?");
			System.out.println("custid"+custId);
			st.setString(1, custId);
			st.executeUpdate();
		} catch (Exception e) {
		}
	}

	public void addData(Customer c) {
		Connection conn=null;
		try {
			System.out.println("add repo");
			String firstname=c.getFirstName();
			String lastname=c.getLastName();
			String id=c.getId();
			String dob=c.getDob();
			double balance=c.getBalance();
			CardType card=c.getCard();
			String dbcard="";
			if(card.equals(CardType.debit)) {
				 dbcard="debit";
			}
			else {
				dbcard="credit";
			}
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			PreparedStatement st = conn.prepareStatement("INSERT INTO CUSTOMERS (FIRSTNAME,LASTNAME,ID,DOB,BALANCE,CARDTYPE) VALUES(?,?,?,?,?,?)");
			st.setString(1, firstname);
			st.setString(2, lastname);
			st.setString(3, id);
			st.setString(4, dob);
			st.setDouble(5, balance);
			st.setString(6, dbcard);
			st.executeUpdate();
			System.out.println("after add repo");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void editData(String id,Customer c) {
		Connection conn=null;
		try {
			System.out.println("edit repo");
			String firstname=c.getFirstName();
			String lastname=c.getLastName();
			String dob=c.getDob();
			double balance=c.getBalance();
			CardType card=c.getCard();
			String dbcard="";
			if(card.equals(CardType.debit)) {
				 dbcard="debit";
			}
			else {
				dbcard="credit";
			}
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			PreparedStatement st = conn.prepareStatement("UPDATE CUSTOMERS SET FIRSTNAME=?,LASTNAME=?,DOB=?,BALANCE=?,CARDTYPE=? WHERE ID=?");
			st.setString(1, firstname);
			st.setString(2, lastname);
			st.setString(3, dob);
			st.setDouble(4, balance);
			st.setString(5, dbcard);
			st.setString(6, id);
			st.executeUpdate();
			System.out.println("after edit repo");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getUsername(String role) {
		Connection conn = null;
		String username="";
		try {
			System.out.println("in admin repo");
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			PreparedStatement st = conn.prepareStatement("SELECT USERNAME FROM USERS WHERE ROLE=?");
			st.setString(1, role);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				username=rs.getString(1);
				}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return username;
	}

	
	
	public String getPassword(String role) {
		Connection conn = null;
		String password="";
		try {
			System.out.println("in admin repo");
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?" + "user=root&password=root");
			PreparedStatement st = conn.prepareStatement("SELECT PASSWORD FROM USERS WHERE ROLE=?");
			st.setString(1, role);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				password=rs.getString(1);
				}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return password;
	}
}
