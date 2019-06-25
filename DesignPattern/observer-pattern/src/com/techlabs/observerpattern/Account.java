package com.techlabs.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int acc_no;
	private String name;
	private double balance;
	private String email;
	private List<IBalanceChangeObserver> observers;
	
	public Account(int acc_no,String name,double balance,String email) {
		this.acc_no=acc_no;
		this.name=name;
		this.balance=balance;
		this.email=email;
		observers=new ArrayList<IBalanceChangeObserver>();
	}

	public int getAcc_no() {
		return acc_no;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public String getEmail() {
		return email;
	}

	public List<IBalanceChangeObserver> getObserver() {
		return observers;
	}
	
	public void deposit(int newBalance) {
		this.balance=this.balance+newBalance;
		notifyObserver();
	}
	
	public void withdraw(int newBalance) {
		if((this.balance-newBalance)>500)
			this.balance=this.balance-newBalance;
		notifyObserver();
	}
	
	public void addObserver(IBalanceChangeObserver observer) {
		observers.add(observer);
	}
	public void notifyObserver() {
		for(IBalanceChangeObserver ib:observers) {
			ib.balanceChanged(this);
		}
	}
}
