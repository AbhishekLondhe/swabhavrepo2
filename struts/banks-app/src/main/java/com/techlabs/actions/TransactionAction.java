package com.techlabs.actions;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Customer;
import com.techlabs.services.BankService;

public class TransactionAction extends ActionSupport implements SessionAware {
	
	private String amount;
	private String transaction;
	
	SessionMap <String,Object> sessionMap;
	
	public TransactionAction() {
		
	}

	@Override
	public void setSession(Map<String, Object> session) {
		
		sessionMap=(SessionMap)session;
		
	}
	public void validate() {
		if(this.amount!=null && this.transaction!=null) {
			
			String name=(String) sessionMap.get("name");
			try {
				BankService.getInstance().doTransaction(name,this.amount,this.transaction);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(this.transaction);
			System.out.println(this.amount);
			
		}
		
	}
	
	@Override
	public String execute() throws Exception {
		
		
		
		return this.SUCCESS;
	}
	
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		
		this.transaction = transaction;
		
	}


}
