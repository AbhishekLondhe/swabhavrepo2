package com.techlabs.model;

import java.util.UUID;

public class Contact {

	private String name;
	private String contactNo;
	private String email;
	private String id;

	public Contact(String name, String contactNo, String email) {
		this.id=UUID.randomUUID().toString();
		this.name = name;
		this.contactNo = contactNo;
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getContactNo() {
		return contactNo;
	}
	public String getEmail() {
		return email;
	}
}
