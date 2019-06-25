package com.techlabs.accountinheritance;

public class CurrentAccount extends Account {

	public CurrentAccount(int AccountNo, String name, double balance) {
		super(AccountNo, name, balance);
	}

	public void withdraw(double amount) {
		System.out.print("\nbefore:"+this.balance);
		double remainBalance = this.balance - amount;
		if (remainBalance >=-2000) 
			this.balance = remainBalance;
		System.out.print(" after:"+this.balance);
	}
}
