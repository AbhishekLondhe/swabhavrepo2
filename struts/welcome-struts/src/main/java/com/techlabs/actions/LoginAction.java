package com.techlabs.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String userName;
	private String password;
	private String loginStatus;

	@Override
	public String execute() throws Exception {

		return this.SUCCESS;
	}
	
	public String doLogin() {
		if(userName.equals("admin") && 
				password.equals("admin")){
			this.loginStatus="Hello " +userName + ", " +" successfully logged in.";
			System.out.println("successfully login");
			return "true";
		}else{
			this.loginStatus="Invalid username or password.";
			System.out.println("invalid");
			return "false";
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
	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	public void validate() {	
		if(this.userName!=null && this.password!=null) {
			if(!userName.equals("admin")){
				addActionError("invalid username");
				this.loginStatus="invalid username";
			}
			if(!password.equals("admin")){
				addActionError("invalid password");
				this.loginStatus="invalid pwd";
			}

			else {
				this.loginStatus="successfully login";
				return;
			}
		}
	}
}
