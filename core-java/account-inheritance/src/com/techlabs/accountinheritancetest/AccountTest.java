package com.techlabs.accountinheritancetest;

import com.techlabs.accountinheritance.*;

public class AccountTest {
	public static void main(String args[]) {
		
		SavingAccount sa=new SavingAccount(2,"xyz",5000);
		CurrentAccount ca=new CurrentAccount(4,"abc",4000);
		printDetails(sa);
		printDetails(ca);
		sa.deposit(2000);
		sa.withdraw(500);
		ca.withdraw(8000);

	}
	
	public static void printDetails(Account a) {
		System.out.print("\n account no:"+a.getAccountNo());
		System.out.print(" name:"+a.getName());
		System.out.print(" balance:"+a.getBalance());
	}
}
