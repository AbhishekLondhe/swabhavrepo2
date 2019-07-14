package com.techlabs.model;

import java.util.Date;

public class Transaction {

	private String name;
	private Date date;
	private String type;
	private double amount;
	
	public Transaction(String name,Date date,String type,double amount) {
		this.name=name;
		this.date=date;
		this.type=type;
		this.amount=amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
