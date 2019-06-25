package com.techlabs.shopping.unittest;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.shopping.Product;

public class ProductUnitTest {

	@Test
	public void checkNumIsEvenOrNot() {
		Product p=new Product(2,"shoe",30,3000);
		int actual=p.getDiscount();
		int expected=30;
		assertEquals(actual,expected);
	}
}
