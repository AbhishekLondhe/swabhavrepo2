package com.techlabs.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Contact;
import com.techlabs.services.ContactService;

public class AddContactAction extends ActionSupport {
	private String name, contactNo, email;
	private String status="add";
	@Override
	public String execute() throws Exception {
		return status;
	}

	public void validate() {
		if (this.name != null && this.contactNo != null && this.email != null) {
			System.out.println("adddd");
				if (!this.name.equals("") && !this.contactNo.equals("") && !this.email.equals("")) {
					ContactService.getInstance().addContact(new Contact(this.name, this.contactNo, this.email));
					status="success";
					return;
				}
				addActionError("Please Fill all Fields");
			}
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
}
