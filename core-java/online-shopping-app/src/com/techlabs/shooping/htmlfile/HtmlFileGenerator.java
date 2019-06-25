package com.techlabs.shooping.htmlfile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.techlabs.shopping.Customer;
import com.techlabs.shopping.Order;

public class HtmlFileGenerator {
	FileWriter fw;
	PrintWriter pw;
	public void addToHtmlFile(Customer c,Order o) throws IOException{
		fw=new FileWriter("G:\\swabhav-repository\\core-java\\online-shopping-app\\data\\index1.html");
		pw=new PrintWriter(fw);
		String addOrder="<p>"+c+" "+o+"<br></p>";
		pw.println("\n"+addOrder);
		pw.close();
	}	
}
