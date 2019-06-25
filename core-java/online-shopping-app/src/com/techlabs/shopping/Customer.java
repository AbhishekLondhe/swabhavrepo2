package com.techlabs.shopping;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;
	private int id;
	private String address;
	private List<Order> orderList;
	private Order order;
	
	public Customer(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void addOrder(Order obj) {
		orderList=new ArrayList<Order>();
		orderList.add(obj);
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public List<Order> getOrder() {
		return orderList;
	}
	@Override
	public String toString() {
		return " customer id:"+this.getId()+" customer name:"+this.getName()+
				" customer address:"+this.getAddress()+" order details"+this.getOrder();
	}
}
