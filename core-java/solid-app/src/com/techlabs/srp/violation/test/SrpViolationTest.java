package com.techlabs.srp.violation.test;

import com.techlabs.srp.violation.Invoice;

public class SrpViolationTest {

	
	public static void main(String args[]) {
		Invoice i=new Invoice(2,"abc",100,0.1);
		i.print();
	}
}
