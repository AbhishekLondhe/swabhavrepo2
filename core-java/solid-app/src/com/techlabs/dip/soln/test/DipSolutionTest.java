package com.techlabs.dip.soln.test;

import com.techlabs.dip.solution.FileLog;
import com.techlabs.dip.solution.ILog;
import com.techlabs.dip.solution.TaxCalculator;

public class DipSolutionTest {

	public static void main(String args[]) {
	
		TaxCalculator calc=new TaxCalculator(new FileLog());
		System.out.println(calc.calculator(0, 10));
}
}
