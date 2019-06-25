package com.techlabs.bankexception;

public class InsufficientFundException extends RuntimeException {

	public InsufficientFundException(Account account) {
		super("this amount cannot withdrawal. Acccount number: " + account.getAccNo() + " name :" + account.getName()
				+ " balance:" + account.getBalance());
	}
}
