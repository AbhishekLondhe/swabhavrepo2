package com.techlabs.actions;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Customer;
import com.techlabs.services.BankService;
import com.techlabs.viewmodel.RegisterVM;

public class RegisterAction extends ActionSupport implements ModelDriven<RegisterVM> {

	@Autowired
	private BankService bs;
	private RegisterVM model;

	
	public RegisterAction() {
		model=new RegisterVM();
	}
	@Override
	public void validate() {
		System.out.println("validate");
		if (model.getName() != null && model.getPassword() != null && model.getConfirmPassword() != null ) {
			if (!model.getName().equals("") && !model.getPassword().equals("") && !model.getConfirmPassword().equals("")
					&& model.getBalance() != 0) {
				if (!model.getPassword().equals(model.getConfirmPassword())) {
					addActionError("pwd not matched");
					return;
				}
				if (model.getPassword().equals(model.getConfirmPassword())) {
					try {
						bs.addCustomer(new Customer(model.getName(), model.getPassword(), model.getBalance()));
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
			else {
				addActionError("plz enter all details");
			}
		}
	}

	@Override
	public String execute() {
		return this.SUCCESS;
	}
	@Override
	public RegisterVM getModel() {
		return model;
	}


}
