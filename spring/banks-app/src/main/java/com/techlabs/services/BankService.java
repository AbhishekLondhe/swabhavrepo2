package com.techlabs.services;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Customer;
import com.techlabs.model.Transaction;
import com.techlabs.repository.BankRepository;

@Service("bankService")
public class BankService {
	@Autowired
	private BankRepository br;

	public BankService() {

		System.out.println("bank service created");
	}

	public void addCustomer(Customer customer) throws SQLException {
		br.addCustomerToDB(customer);
	}

	public Customer loginValidation(String userName) throws Exception {
		return br.getpassword(userName);
	}

	public List<Transaction> transactionList(String userName) {
		return br.getTransaction(userName);
	}

	public void doTransaction(String name, String amount, String transaction) throws SQLException {
		br.doTransaction(name, amount, transaction);

	}
}
