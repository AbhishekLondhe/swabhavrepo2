package com.techlabs.shopping;


public class Product {

	private int productId;
	private String productName;
	private int discount;
	private double productCost;
	
	public Product(int productId,String productName,int discount,double productCost) {
		this.productId=productId;
		this.productName=productName;
		this.discount=discount;
		this.productCost=productCost;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getDiscount() {
		return discount;
	}

	public double getProductCost() {
		return productCost;
	}
	
	public double calculateTotalCost() {
		double totalCost=0;
		totalCost=(this.productCost-(this.productCost*this.discount)/100);
		return totalCost;
		}
	
	@Override
	public String toString() {
		return "Product Id:"+this.getProductId()+"Product name:"+this.getProductName()+
				" Product discount:"+this.getDiscount()+" product cost:"+this.getProductCost();
	}
}
