package com.techlabs.shoppingtest;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.techlabs.shooping.htmlfile.HtmlFileGenerator;
import com.techlabs.shopping.Customer;
import com.techlabs.shopping.LineItem;
import com.techlabs.shopping.Order;
import com.techlabs.shopping.Product;

public class CustomerTest {
public static void main(String args[]) {
	
	SimpleDateFormat formatter=new SimpleDateFormat("dd/mm/yyyy");
	try {
	Product p=new Product(2,"shoe",30,2000);
	Product p1=new Product(4,"tshirt",40,1500);
	Product p2=new Product(3,"shoe",20,3000);
	
	LineItem l=new LineItem(4,5,p);
	LineItem l1=new LineItem(3,6,p1);
	LineItem l2=new LineItem(7,3,p2);
	
	Order o=new Order(6,formatter.parse("2/5/2019"));
	o.addLineItem(l);
	o.addLineItem(l1);
	o.addLineItem(l2);
	

	
	Customer c=new Customer(19,"abc","mumbai");
	c.addOrder(o);
	HtmlFileGenerator h=new HtmlFileGenerator();
	h.addToHtmlFile(c, o);
	
	System.out.println(c);
	}catch(ParseException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}
}
