package com.techlabs.interfacecrud;

public class OrderDB implements ICrudable{

	@Override
	public void create() {
		System.out.println("OrderDB created..");
	}
	
	@Override
	public void read() {
		System.out.println("OrederDB read..");
	}
	
	@Override
	public void update() {
		System.out.println("OrderDB updated..");
	}
	
	@Override
	public void delete() {
		System.out.println("OrderDB deleted..");
	}


}
