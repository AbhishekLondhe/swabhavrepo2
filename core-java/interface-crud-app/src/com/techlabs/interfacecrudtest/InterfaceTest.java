package com.techlabs.interfacecrudtest;

import com.techlabs.interfacecrud.*;
public class InterfaceTest {

	
	public static void main(String args[]) {
		ICrudable x;
		x= new InvoiceDB();
		printDetails(x);
		x=new OrderDB();
		printDetails(x);
		x=new CustomerDB();
		printDetails(x);
		
	}
	public static void printDetails(ICrudable i) {
		i.create();
		i.read();
		i.update();
		i.delete();
	}
}
