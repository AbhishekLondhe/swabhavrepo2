package com.techlabs.actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Customer;
import com.techlabs.services.BankService;

public class LoginAction extends ActionSupport implements SessionAware{

	private String userName,password,validPwd;
	private SessionMap<String,Object> sessionMap;
	private Customer c=null;
	
	@Override
	public String execute() throws Exception {
		return this.SUCCESS;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap=(SessionMap)session;
	}
	
	public void validate() {
		if(this.userName!=null && this.password!=null) {
			if(!this.userName.equals("") && !this.password.equals("")) {
				try {
					c=BankService.getInstance().loginValidation(userName);
					validPwd=c.getPassword();
					if(this.validPwd.equals(this.password)) {
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
