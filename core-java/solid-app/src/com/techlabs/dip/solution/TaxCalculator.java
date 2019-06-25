package com.techlabs.dip.solution;

public class TaxCalculator {
	
private ILog log;
public TaxCalculator(ILog log) {
	this.log=log;
}
public int calculator(int amount1,int amount2) {
	try {
		int r = amount1/amount2;
	}catch(Exception e) {
		log.log(e.getMessage());
		return 0;
	}
	return 1;
}
}
