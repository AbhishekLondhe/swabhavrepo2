package com.techlabs.shopping;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Order {

	private int orderId;
	private Date orderDate;
	private LineItem item;
	private List<LineItem> lineItem=new ArrayList<LineItem>();
	private Map<String, Integer> productWithQuantity;

	public Order(int orderId, Date orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;

	}

	public int getOrderId() {
		return orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public LineItem getItem() {
		return item;
	}

	public List<LineItem> getLineItem() {
		return lineItem;
	}

	public void addLineItem(LineItem item) {
		for (Iterator<LineItem> i = lineItem.iterator(); i.hasNext();) {
			LineItem item2 = (LineItem) i.next();
			if (item.getProduct().equals(item2.getProduct())) {
				int totalQuantity = item.getQuantity() + item2.getQuantity();
				item2.setQuantity(totalQuantity);
				return ;
			}
		}
		lineItem.add(item);
	}

	public double checkOutPrice() {
		double cost = 0;
		for (LineItem i : lineItem) {
			cost = cost + i.totalCostWithQuantity();
		}
		return cost;
	}

	@Override
	public String toString() {
		return " order id " + this.getOrderId() + " date " + this.getOrderDate() + " lineitem details:"
				+ this.getLineItem();
	}

	/*public Map<String, Integer> getProductWithQuantity() {
		productWithQuantity = new HashMap<String, Integer>();
		for (LineItem i : lineItem) {
			if (productWithQuantity.containsKey(i.getProduct().getProductName())) {
				productWithQuantity.put(i.getProduct().getProductName(),
						productWithQuantity.get(i.getProduct().getProductName()) + i.getQuantity());
			} else {
				productWithQuantity.put(i.getProduct().getProductName(), i.getQuantity());
			}
		}
		return productWithQuantity;
	}*/

}
