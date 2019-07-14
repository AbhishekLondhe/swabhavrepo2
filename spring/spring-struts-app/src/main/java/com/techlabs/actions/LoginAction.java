package com.techlabs.actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private String userName;
	private String password;
	private SessionMap<String, Object> sessionMap;

	@Override
	public String execute() throws Exception {
		return this.SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap = (SessionMap) session;
	}

	
	public void validate() {
		if(this.userName!=null && this.password!=null){
			if(this.userName.equals("admin") && this.password.equals("admin")) {
				System.out.println("login successful");
				sessionMap.put("name", userName);
			}
			addActionError("enter name and pwd");
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
