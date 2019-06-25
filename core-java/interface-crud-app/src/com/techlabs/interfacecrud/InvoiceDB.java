package com.techlabs.interfacecrud;

public class InvoiceDB implements ICrudable{

	@Override
	public void create() {
		System.out.println("invoiceDB created..");
	}

	@Override
	public void read() {
		System.out.println("invoiceDB read..");
	}

	@Override
	public void update() {
		System.out.println("invoiceDB updated..");
	}

	@Override
	public void delete() {
		System.out.println("invoiceDB deleted..");
	}
}
