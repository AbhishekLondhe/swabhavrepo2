package com.techlabs.actions;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.techlabs.services.ContactService;

public class DeleteContactAction implements Action{
	private String id;


	@Override
	public String execute() throws Exception {
		ContactService.getInstance().removeContact(id);
		return this.SUCCESS;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
