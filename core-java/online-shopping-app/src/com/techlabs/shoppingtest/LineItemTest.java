package com.techlabs.shoppingtest;

import com.techlabs.shopping.LineItem;
import com.techlabs.shopping.Product;

public class LineItemTest {

	
	public static void main(String args[]) {
		LineItem l=new LineItem(10,4,new Product(10,"shoe",30,4000));
		LineItem l1=new LineItem(20,5,new Product(10,"shoe",20,4000));
		printLineItemData(l);
		printLineItemData(l1);
		
	}

	public static void printLineItemData(LineItem l) {
		System.out.print("\nLineItem ID:"+l.getLineItemId());
		System.out.print(" Quantity:"+l.getQuantity());
		System.out.print(" total cost with quantity:"+l.totalCostWithQuantity());
		System.out.println(" "+l);
	}
}
