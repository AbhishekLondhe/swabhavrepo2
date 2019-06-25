package com.techlabs.accountinheritance;

public class SavingAccount extends Account {

	private final int MIN_BALANCE = 500;

	public SavingAccount(int AccountNo, String name, double balance) {
		super(AccountNo, name, balance);
	}

	public void withdraw(double amount) {
		System.out.print("\nbefore:" + this.balance);
		double remainBalance = this.balance - amount;
		if (remainBalance > MIN_BALANCE) {
			this.balance = remainBalance;
			System.out.print(" after:" + this.balance);
		}
	}
}
