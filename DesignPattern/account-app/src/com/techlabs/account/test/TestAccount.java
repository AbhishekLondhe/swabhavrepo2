package com.techlabs.account.test;

import com.techlabs.account.ProxyAccount;

public class TestAccount {

	public static void main(String args[]) {
		ProxyAccount acc1=new ProxyAccount(10,"abc",2000);
		acc1.deposit(500);
		acc1.deposit(200);
		acc1.withdraw(400);
	}
}
