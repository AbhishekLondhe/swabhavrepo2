package com.techlabs.model;

public class Customer {
	private String name;
	private String password;
	private double balance;
	
	public Customer(String name,String password,double balance) {
		this.name=name;
		this.password=password;
		this.balance=balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
