package com.techlabs.actions;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

public class HomeAction implements Action{
	private String message; 

	public HomeAction(){
		System.out.println("Home Action Created");
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("inside Action execute");
		return this.SUCCESS;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message=message;
	}
}
