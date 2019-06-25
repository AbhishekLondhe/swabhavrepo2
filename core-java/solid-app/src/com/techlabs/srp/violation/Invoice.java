package com.techlabs.srp.violation;

public class Invoice {

	
	private int id;
	private String name;
	private double cost;
	private double discount ;
	private final double GST=0.12;
	
	public Invoice(int id,String name,double cost,double discount) {
		this.id=id;
		this.name=name;
		this.cost=cost;
		this.discount=discount;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getCost() {
		return cost;
	}
	public double getDiscount() {
		return discount;
	}
	
	public double calculateTax() {
		double tax= this.cost*GST;
		return tax;
	}
	public double calculateDiscount() {
		double discountCost=this.cost*(discount/100);
		return discountCost;
	}
	
	public double calculateFinalCost() {
		double finalCost=this.cost+calculateTax()-calculateDiscount();
		return finalCost;
	}
	public void print() {
		System.out.println("id:"+this.getId());
		System.out.println("name:"+this.getName());
		System.out.println("final Cost:"+this.calculateFinalCost());
	}
}
