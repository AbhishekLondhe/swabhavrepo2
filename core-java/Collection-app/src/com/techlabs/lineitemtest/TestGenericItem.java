package com.techlabs.lineitemtest;

import java.util.ArrayList;

import com.techlabs.lineitem.LineItem;

public class TestGenericItem {
	public static void main(String args[]) {
		ArrayList<LineItem> cart = new ArrayList<LineItem>();
		cart.add(new LineItem(101, "book", 2, 500));
		cart.add(new LineItem(102, "pen", 4, 300));
		cart.add(new LineItem(103, "pencil", 5, 600));
	
		for (LineItem element : cart) {
				System.out.println(element.calculateTotal());
		}
	}

}
