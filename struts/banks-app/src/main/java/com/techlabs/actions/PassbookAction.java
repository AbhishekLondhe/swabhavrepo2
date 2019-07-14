package com.techlabs.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Transaction;
import com.techlabs.services.BankService;

public class PassbookAction implements Action,SessionAware {

	private List<Transaction> transactionList;
	private SessionMap<String,Object> sessionMap; 
	private int count=0;
	
	public PassbookAction() {
		transactionList=new ArrayList<Transaction>();
	}
	
	@Override
	public String execute() throws Exception {
		String name=(String) sessionMap.get("name");
		transactionList =BankService.getInstance().transactionList(name);
		count=transactionList.size();
		System.out.println("count"+count);
		return this.SUCCESS;
	}

	public List<Transaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap=(SessionMap)session;
	}
	

}
