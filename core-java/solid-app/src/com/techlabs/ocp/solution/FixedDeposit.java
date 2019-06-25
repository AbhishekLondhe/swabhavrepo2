package com.techlabs.ocp.solution;


public class FixedDeposit {

	private int accoutId;
	private String name;
	private double principle;
	private int years;
	private IFestivalRate festival;

	public FixedDeposit(int accountId, String name, double principle, int years, IFestivalRate festival) {
		this.accoutId = accountId;
		this.name = name;
		this.principle = principle;
		this.years = years;
		this.festival = festival;
	}

	public int getAccoutId() {
		return accoutId;
	}

	public String getName() {
		return name;
	}

	public double getPrinciple() {
		return principle;
	}

	public int getYears() {
		return years;
	}

	public IFestivalRate getFestival() {
		return festival;
	}
	
	public double calculateSimpleInterest() {
		return principle*festival.calculateRate()*years;
	}

}
