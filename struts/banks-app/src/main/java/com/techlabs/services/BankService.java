package com.techlabs.services;

import java.sql.SQLException;
import java.util.List;

import com.techlabs.model.Customer;
import com.techlabs.model.Transaction;
import com.techlabs.repository.BankRepository;

public class BankService {

private BankRepository br;
	
	private static BankService  instance;
	
	private BankService () {
		
		br = new BankRepository();
		
	}
	public static BankService  getInstance() {
		if (instance == null) {
			instance = new BankService ();
		}
		return instance;
	}

	public void addCustomer(Customer customer) throws SQLException  {
		br.addCustomerToDB(customer);
	}
	
	public Customer loginValidation(String userName) throws Exception{
		return br.getpassword(userName);
	}
	
	public List<Transaction> transactionList(String userName){
		return br.getTransaction(userName);
	}
	
	public void doTransaction(String name,String amount,String transaction) throws SQLException {
		br.doTransaction(name,amount,transaction);
		
	}
}

