package com.techlabs.actions;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class SessionAction implements Action,SessionAware{

	@Override
	public void setSession(Map<String, Object> session) {
		 if(session.get("count")==null) {
			 session.put("count", 0);
		 }
		 session.put("count", (Object)((Integer)session.get("count")+1));
	}

	@Override
	public String execute() throws Exception {
		System.out.println("inside session");
		return this.SUCCESS;
	}

}
