package com.techlabs.customer;

public class Customer {

	private String firstName;
	private String lastName;
	private int customerId;
	private static int nextCustomerId ;
	private CardType card;

	static {
		nextCustomerId= 1000;
		System.out.println("static block");
	}
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerId = nextCustomerId += 1;
	}

	public Customer(String firstName, String lastName, CardType card) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.card = card;
		this.customerId = nextCustomerId += 1;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public CardType getCard() {
		return card;
	}

	public int getCustomerId() {
		return customerId;
	}
}
