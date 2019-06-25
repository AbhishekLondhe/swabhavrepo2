package com.techlabs.customertest;

import com.techlabs.customer.*;

public class CustomerTest {

	public static void main(String args[]) {
		Customer c1 = new Customer("p", "q");
		System.out.println(c1.getCustomerId());
		Customer c2 = new Customer("a", "b");
		System.out.println(c2.getCustomerId());
		System.out.println(c1.getCustomerId());
		Customer c3 = new Customer("x", "y");
		System.out.println(c3.getCustomerId());
		System.out.println(c2.getCustomerId());
		Customer c4= new Customer("c","d",CardType.credit);
		System.out.println(c4.getCustomerId());
		display(c4);
	}
	
	public static void display(Customer c) {
		System.out.println("firstName:"+c.getFirstName());
		System.out.println("lastName:"+c.getLastName());
		System.out.println("Card Type:"+c.getCard());
		System.out.println("customerId:"+c.getCustomerId());
	}
}
