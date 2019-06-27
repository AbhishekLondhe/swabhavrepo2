package com.techlabs.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlabs.model.CardType;
import com.techlabs.model.Customer;
import com.techlabs.repository.CustomerRepository;

public class CustomerServices {
	private static CustomerServices instance;
	private Customer c1, c2, c3;
	private List<Customer> CustomerList = new ArrayList<Customer>();
	private static CustomerRepository custRepo=new CustomerRepository();
	public CustomerServices() {
//		c1 = new Customer("abhishek", "londhe", "26/5/96", 2000, CardType.credit);
//		c2 = new Customer("deepak", "gupta", "24/6/95", 4000, CardType.debit);
//		c3 = new Customer("shekhar", "patil", "23/4/96", 5000, CardType.credit);
//		addCustomer(c1);
//		addCustomer(c2);
//		addCustomer(c3);
	}
	
	public static CustomerServices getInstance() {
		if(instance==null) {
			instance=new CustomerServices();	
			custRepo.loadData();	
		}
		return instance;
	}
	
	public void addCustomer(Customer c) {
		CustomerList.add(c);
		custRepo.addData(c);
	}

	public List<Customer> getCustomer() {
		CustomerList =custRepo.getData();
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
	
	public void editCustomer(String id,Customer c) {
		custRepo.editData(id,c );
	}
	
	public void removeCustomerById(String id) {
		System.out.println("inside remove service");
		for(Customer c:CustomerList) {
			if(c.getId().equals(id)) {
				CustomerList.remove(c);
				custRepo.deleteData(id);
				return;
			}
		}
	}
	
	public String getUname() {
		return custRepo.getUsername("admin");
	}
	
	public String getpwd() {
		return custRepo.getPassword("admin");
	}
	
	
}
