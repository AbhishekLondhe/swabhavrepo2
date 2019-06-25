package com.techlabs.collection.map;

import com.techlabs.collection.set.Student;

public class LineItem implements Comparable {


	private int id;
	private String name;
	private double cost;
	private int quantity;
	
	
	public LineItem(int id,String name,double cost,int quantity) {
		this.id=id;
		this.name=name;
		this.cost=cost;
		this.quantity=quantity;
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
	public int getQuantity() {
		return quantity;
	}
	
	public double calculateTotal() {
		double price =quantity * cost;
		return price;
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null || this.getClass()!=obj.getClass())
			return false;
		LineItem s=(LineItem) obj;
		return ((s.id==this.id)&&(s.quantity==this.quantity));
	}	
	
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public int compareTo(Object o) {
		LineItem lineItem=(LineItem) o;
		return this.id- lineItem.id;
	}
	
}
