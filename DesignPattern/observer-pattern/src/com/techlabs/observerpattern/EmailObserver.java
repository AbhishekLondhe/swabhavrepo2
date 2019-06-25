package com.techlabs.observerpattern;

public class EmailObserver implements IBalanceChangeObserver{

	@Override
	public void balanceChanged(Account account) {
		System.out.println("Email Observer Balance updated....");
	}

	
	
}
