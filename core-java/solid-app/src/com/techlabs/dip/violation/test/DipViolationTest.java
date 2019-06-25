package com.techlabs.dip.violation.test;

import com.techlabs.dip.violation.LogType;
import com.techlabs.dip.violation.TaxCalculator;

public class DipViolationTest {

	public static void main(String args[]) {
		TaxCalculator calc=new TaxCalculator(LogType.DB);
		calc.calculator(0, 0);
	}
}
