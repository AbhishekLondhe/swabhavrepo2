package com.techlabs.srp.solution.test;

import com.techlabs.srp.solution.InvoiceConsolePrinter;
import com.techlabs.srp.solution.*;

public class SrpSolutionTest {

	public static void main(String args[]) {
		Invoice i=new Invoice(2,"abc",100,0.1);
		InvoiceConsolePrinter console=new InvoiceConsolePrinter();
		console.consolePrinter(i);
	}
}
