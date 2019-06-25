package com.techlabs.account;

import java.time.LocalTime;

public class ProxyAccount extends Account {

	// private int accNo;
	// private String name;
	// private double balance;

	private Account account;
	private LocalTime time = LocalTime.now();

	public ProxyAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
		account = new Account(accNo, name, balance);
	}

	public Account getAccount() {
		return account;
	}

	public void deposit(double amount) {
		super.deposit(amount);
		System.out.println("deposit amount: " + amount + " balance: " + account.getBalance() + " time: " + time);
	}

	public void withdraw(double amount) {
		super.withdraw(amount);
		System.out.println("withdraw amount:" + amount + " balance: " + account.getBalance() + " time: " + time);
	}
}
