package com.techlabs.srp.solution;

public class InvoiceConsolePrinter {

	
	public void consolePrinter(Invoice i) {
		System.out.println("id:"+i.getId());
		System.out.println("name:"+i.getName());
		System.out.println("final Cost:"+i.calculateFinalCost());
	}
}
