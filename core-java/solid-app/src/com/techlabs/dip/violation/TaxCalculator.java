package com.techlabs.dip.violation;

public class TaxCalculator {

	private LogType log;
	public TaxCalculator(LogType log) {
		this.log=log;
	}
	public void calculator(int amount1,int amount2) {
		try {
			int r = amount1/amount2;
		}catch(Exception e) {
			if(log==LogType.FILE) {
				new FileLog().Log(e.getMessage());
			}
			if(log==LogType.DB) {
				new DBLog().Log(e.getMessage());
			}
		}
	}
}
