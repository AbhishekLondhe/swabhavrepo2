package com.techlabs.shoppingtest;

import com.techlabs.shopping.Product;

public class ProductTest {

	
	public static void main(String args[]) {
		Product p=new Product(10,"shoe",20,2000);
		printProductData(p);
	}
	
	public static void printProductData(Product p) {
		System.out.print("\nProduct ID:"+p.getProductId());
		System.out.print(" Product Name:"+p.getProductName());
		System.out.print(" Discount:"+p.getDiscount());
		System.out.print(" Original Cost:"+p.getProductCost());
		System.out.println(" Cost with discount:"+p.calculateTotalCost());
	}
}
