package com.techlabs.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadDemo {
	
	public static void main(String args[]) throws IOException {
		Properties p = new Properties();
	InputStream is=new FileInputStream("data.properties");
	p.load(is);
	System.out.println(p.getProperty("Username"));
	p.list(System.out);
	
}
}
