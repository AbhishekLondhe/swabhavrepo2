package com.techlabs.account;

public class Account {
	private String accountNo;
	private String name;
	private double balance;
	private static int count;
	private static final double MINBAL =500;
	
	static {
		count=0;
		System.out.println("static block");
	}

	
	public Account(String accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		count++;
		System.out.println("constructor block");
	}

	public Account(String accountNo, String name) {
		this(accountNo, name, 1000);
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}

	public void withdraw(double amount) {
		double bal = this.balance - amount;
		if (bal > MINBAL)
			this.balance = bal;
	}

	public String getAccNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public int getCount() {
		return count;
	}
	
	public static int headCount() {
		return count;
	}
}
