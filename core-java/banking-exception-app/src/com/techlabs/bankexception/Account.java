package com.techlabs.bankexception;

public class Account {

	private int accountNo;
	private String name;
	private double balance;
	
	
	
	public Account(int accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public int getAccNo() {
		return accountNo;
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
		double remainBalance = balance - amount;
		if (remainBalance > 500) {
			this.balance = this.balance - amount;
		} else {
			throw new InsufficientFundException(this);
		}
	}	
}
