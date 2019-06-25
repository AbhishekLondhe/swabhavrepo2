package com.techlabs.bankexceptiontest;

import com.techlabs.bankexception.Account;
import com.techlabs.bankexception.InsufficientFundException;

public class BankExceptionTest {

	public static void main(String args[]) {
		Account acc = new Account(1, "abc", 2000);
		try {
			acc.withdraw(1600);
		} catch (InsufficientFundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end of main");
	}

}
