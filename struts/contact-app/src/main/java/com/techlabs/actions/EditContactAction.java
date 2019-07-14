package com.techlabs.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Contact;
import com.techlabs.services.ContactService;

public class EditContactAction extends ActionSupport {

	private static String id;
	private static Contact c;
	private static  String name;
	private static String email;
	private static String contactNo;
	private static int  counter1=0;
	private static int counter2=0;
	
	
	public EditContactAction(){
		if(counter1 ==2 && counter2==4) {
			counter1=0;
			counter2=0;
		}
   }
	
	
	public void validate() {
		if (this.name != null && this.contactNo != null && this.email != null) {
			if (!this.name.equals("") && !this.contactNo.equals("") && !this.email.equals("")) {
				ContactService.getInstance().updateContactById(this.id, this.name, this.contactNo, this.email);
				System.out.println("val"+id);
				return;
			}
			addActionError("Please Fill all Fields");
		}
		counter1++;
		counter2++;
	}
	
	
	@Override
	public String execute() throws Exception {
		c=ContactService.getInstance().getContactById(id);
		this.name=c.getName();
		this.contactNo=c.getContactNo();
		this.email=c.getEmail();
		counter1++;
		counter2++;
		return this.SUCCESS;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
}
