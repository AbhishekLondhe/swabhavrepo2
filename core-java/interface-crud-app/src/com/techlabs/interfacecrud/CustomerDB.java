package com.techlabs.interfacecrud;

public class CustomerDB implements ICrudable{

	
	@Override
	public void create() {
		System.out.println("CustomerDB created..");
	}
	
	@Override
	public void read() {
		System.out.println("CustomerDB read..");
	}
	
	@Override
	public void update() {
		System.out.println("CustomerDB updated..");
	}
	
	@Override 
	public void delete() {
		System.out.println("CustomerDB deleted..");
	}

}
