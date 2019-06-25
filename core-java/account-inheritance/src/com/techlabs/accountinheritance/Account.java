package com.techlabs.accountinheritance;

public abstract class Account {

	private int accountNo;
	private String name;
	protected double balance;


	public Account(int accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amount) {
		System.out.print("\nbefore:"+this.balance);
		this.balance = this.balance + amount;
		System.out.print(" after:"+this.balance);
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public abstract void withdraw(double amount);
}
