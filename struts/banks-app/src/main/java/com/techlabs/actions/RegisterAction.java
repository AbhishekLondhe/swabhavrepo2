package com.techlabs.actions;

import java.sql.SQLException;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Customer;
import com.techlabs.services.BankService;

public class RegisterAction extends ActionSupport {
	private String name;
	private String password;
	private String confirmPassword;
	private double balance;

	public RegisterAction() {
		
	}
	@Override
	public void validate() {
		System.out.println("validate");
		if (this.name != null && this.password != null && this.confirmPassword != null ) {
			if (!this.name.equals("") && !this.password.equals("") && !this.confirmPassword.equals("")
					&& this.balance != 0) {
				if (!this.password.equals(this.confirmPassword)) {
					addActionError("pwd not matched");
					return;
				}
				if (this.password.equals(this.confirmPassword)) {
					try {
						BankService.getInstance().addCustomer(new Customer(this.name, this.password, this.balance));
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
			addActionError("plz enter all details");
		}
	}


	@Override
	public String execute() {
		return this.SUCCESS;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
