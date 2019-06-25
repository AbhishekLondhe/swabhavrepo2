package com.techlabs.accounttest;

import com.techlabs.account.*;

public class AccountTest {

	public static void main(String args[]) {
		Account a1 = new Account("01", "Abhishek", 5000);
		display(a1);
		a1.deposit(1000);
		display(a1);
		a1.withdraw(2000);
		display(a1);

		Account a2 = new Account("05", "xyz");
		display(a2);
		a2.withdraw(200);
		System.out.println(a2.getBalance());

		Account a3 = new Account("6", "pqr", 10000);
		display(a3);
		a3.withdraw(96000);
		
		display(new Account("7","abc",6000));

		Account a4=new Account("8","mno");
		display(a4);
	}

	public static void display(Account a) {
		System.out.println("\nAccount no.:" + a.getAccNo());
		System.out.println("Name:" + a.getName());
		System.out.println("Balance:" + a.getBalance());
		System.out.println("count:"+a.getCount());
	}
}
