package com.techlabs.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlabs.model.CardType;
import com.techlabs.model.Customer;

public class CustomerServices {
	private static CustomerServices instance;
	private Customer c1, c2, c3;
	private List<Customer> CustomerList = new ArrayList<Customer>();

	public CustomerServices() {
		c1 = new Customer("abhishek", "londhe", "26/5/96", 2000, CardType.credit);
		c2 = new Customer("deepak", "gupta", "24/6/95", 4000, CardType.debit);
		c3 = new Customer("shekhar", "patil", "23/4/96", 5000, CardType.credit);
		addCustomer(c1);
		addCustomer(c2);
		addCustomer(c3);
	}
	
	public static CustomerServices getInstance() {
		if(instance==null) {
			instance=new CustomerServices();
		}
		return instance;
	}
	

	public void addCustomer(Customer c) {
		CustomerList.add(c);
	}

	public List<Customer> getCustomer() {
		return CustomerList;
	}
	
	public  Customer getCustomerById(String id) {
		System.out.println("inside services");
		for(Customer c:CustomerList) {
			if(c.getId().equals(id))
				return c;
		}
		return null;
	}
	
	public void removeCustomerById(String id) {
		System.out.println("inside remove service");
		for(Customer c:CustomerList) {
			if(c.getId().equals(id)) {
				CustomerList.remove(c);
				return;
			}
		}
	}
}
