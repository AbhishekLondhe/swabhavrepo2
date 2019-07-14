package com.techlabs.actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.Customer;
import com.techlabs.services.BankService;
import com.techlabs.viewmodel.LoginVM;

public class LoginAction extends ActionSupport implements SessionAware,ModelDriven<LoginVM>{
	private String validPwd;
	private SessionMap<String,Object> sessionMap;
	private Customer c=null;
	@Autowired
	private BankService bs;
	private LoginVM model;
	
	public LoginAction() {
		model=new LoginVM();
	}
	
	@Override
	public String execute() throws Exception {
		return this.SUCCESS;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap=(SessionMap)session;
	}
	
	public void validate() {
		if(model.getUserName()!=null && model.getPassword()!=null) {
			if(!model.getUserName().equals("") && !model.getPassword().equals("")) {
				try {
					c=bs.loginValidation(model.getUserName());
					validPwd=c.getPassword();
					if(this.validPwd.equals(model.getPassword())) {
						System.out.println("login success");
						sessionMap.put("name", c.getName());
						sessionMap.put("balance", c.getBalance());
					}
					else {
						addActionError("enter correct userName and password");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			else {
				addActionError("please enter username and password");
			}
		}
	}

	@Override
	public LoginVM getModel() {
		return model;
	}

	
}
