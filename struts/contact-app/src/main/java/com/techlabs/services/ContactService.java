package com.techlabs.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.techlabs.model.Contact;

public class ContactService {

	private static ContactService instance;
	Contact c1,c2,c3;
	private List<Contact> contactList=new ArrayList<Contact>();
	
	private  ContactService() {
		c1=new Contact("xyz","11111111","xyz@");
		c2=new Contact("abc","22222222","abc@");
		c3=new Contact("pqr","33333333","pqr@");
		addContact(c1);
		addContact(c2);
		addContact(c3);
	}
	
	public static ContactService getInstance() {
		if(instance==null) {
			instance=new ContactService();
		}
		return instance;
	}
	
	public void addContact(Contact c) {
		contactList.add(c);
	}
	
	public List<Contact> getContact(){
		return contactList;
	}
	
	
	public Contact getContactById(String id) {
		for (Iterator<Contact> iterator = contactList.iterator(); iterator.hasNext(); ) {
		    Contact c = iterator.next();
		    if(c.getId().equals(id)) {
		        return c;
		    }
		}
		return null;
	}
	public void updateContactById(String id,String name,String contactNo,String email) {
		for (Iterator<Contact> iterator = contactList.iterator(); iterator.hasNext(); ) {
		    Contact c = iterator.next();
		    if(c.getId().equals(id)) {
		        c.setName(name);
		        c.setContactNo(contactNo);
		        c.setEmail(email);
		    }
		}
	}	
	
	
	public void removeContact(String id) {
		for (Iterator<Contact> iterator = contactList.iterator(); iterator.hasNext(); ) {
		    Contact c = iterator.next();
		    if(c.getId().equals(id)) {
		        iterator.remove();
		    }
		}
	}
}
