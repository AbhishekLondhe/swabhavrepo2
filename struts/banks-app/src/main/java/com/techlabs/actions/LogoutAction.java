package com.techlabs.actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class LogoutAction implements Action,SessionAware{

	private SessionMap<String,Object> sessionMap; 
	
	@Override
	public String execute() throws Exception {
		if(sessionMap!=null){  
	        sessionMap.invalidate();  
	    }  
		return this.SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		sessionMap=(SessionMap)session;
	}

	
	
}
