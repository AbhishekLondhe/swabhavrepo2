package com.techlabs.account;

public class Account {

	private int accNo;
	private String name;
	private double balance;

	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}

	public void withdraw(double amount) {
		this.balance = this.balance - amount;
	}
}
