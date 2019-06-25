package com.techlabs.shopping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LineItem {

	private int lineItemId;
	private int quantity;
	private Product product;
	
	public LineItem(int lineItemId,int quantity,Product product) {
		this.lineItemId=lineItemId;
		this.quantity=quantity;
		this.product=product;
	}


	public int getLineItemId() {
		return lineItemId;
	}


	public void setQuantity(int newQuantity) {
		quantity=newQuantity;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}
	
	public double totalCostWithQuantity() {
		double totalCost=0;
		totalCost=this.quantity*product.calculateTotalCost();
		return totalCost;
	}
	
	@Override
	public String toString() {
		return " lineitem id:"+this.getLineItemId()+
				" quantity:"+this.getQuantity()+" product details:"+this.getProduct();
	}
}
