package com.techlabs.lineitemtest;

import java.util.ArrayList;

import com.techlabs.lineitem.LineItem;

public class TestLineItem {

	public static void main(String args[]) {
		ArrayList cart = new ArrayList();
		cart.add(new LineItem(101, "book", 2, 500));
		cart.add(new LineItem(102, "pen", 4, 300));
		cart.add(new LineItem(103, "pencil", 5, 600));
		cart.add("shekhar");

		for (Object element : cart) {
			LineItem obj=(LineItem) element;
				System.out.println(obj.calculateTotal());
		}
	}
}
