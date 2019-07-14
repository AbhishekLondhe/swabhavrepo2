package com.techlabs.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Contact;
import com.techlabs.services.ContactService;

public class DisplayContactAction extends ActionSupport {
	private List<Contact> contactList;
	private int count=0;

	public DisplayContactAction() {

		contactList = new ArrayList<Contact>();
	}
	
	
	@Override
	public String execute() throws Exception {
		System.out.println("inside display");
		contactList = ContactService.getInstance().getContact();
		count=contactList.size();
		return this.SUCCESS;
	}

	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}
}
