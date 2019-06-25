package com.techlabs.reflectionpractice;

public class Bank {

	private int accountNo;
	private static String str;
	private String firstName;
	private String lastName;
	private double balance;
	private int cId;
	private static int customerId;

	static {
		customerId = 0;
		str="Bank application";
	}

	public Bank() {
		
	}
	
	public Bank(int accountNo, String firstName, String lastName, double balance) {
		this.accountNo = accountNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		this.cId = customerId += 1;
	}

	public Bank(int accountNo, String firstName, String lastName) {
		this(accountNo, firstName, lastName, 1000);
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getCustomerId() {
		return cId;
	}
	
	public void deposit(double amount) {
		this.balance+=amount;
		System.out.println("DEPOSIT AMOUNT:"+amount+"balance:"+this.balance);
	}
	
	public static void display() {
		System.out.println("public method!!"+str);
	}
	
	private void show() {
		System.out.println("private method!!!");
	}
	
	
	
	
	
	
}
