package com.techlabs.ocp.violation;

public class FixedDeposit {

	private int accoutId;
	private String name;
	private double principle;
	private int years;
	private FestivalType season;

	public FixedDeposit(int accountId, String name, double principle, int years, FestivalType season) {
		this.accoutId = accountId;
		this.name = name;
		this.principle = principle;
		this.years = years;
		this.season = season;
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

	public FestivalType getSeason() {
		return season;
	}

	public double calculateSimpleInterest() {
		double simpleInterest;
		if(FestivalType.HOLI==season) 
			return 	simpleInterest=principle*0.8*years;
		if(FestivalType.NEWYEAR==season) 
			return simpleInterest=principle*0.85*years;
		return simpleInterest=principle*0.7*years;
		}
}
