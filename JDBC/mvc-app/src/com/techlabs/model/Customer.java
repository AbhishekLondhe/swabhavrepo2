package com.techlabs.model;

import java.util.UUID;

public class Customer {
private String firstName;
private String lastName;
private String id;
private String dob;
private double balance;
private CardType card;

public Customer(String firstName,String lastName,String dob,double balance,CardType card) {
	this.id=UUID.randomUUID().toString();
	this.firstName=firstName;
	this.lastName=lastName;
	this.dob=dob;
	this.balance=balance;
	this.card=card;
}

public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

public String getId() {
	return id;
}

public String getDob() {
	return dob;
}

public double getBalance() {
	return balance;
}

public CardType getCard() {
	return card;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}


public void setDob(String dob) {
	this.dob = dob;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public void setCard(CardType card) {
	this.card = card;
}

@Override
public String toString() {
	return " customer id:"+id+" firstname:"+firstName+" lastName:"+lastName;
}

}
