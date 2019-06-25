package com.techlabs.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class WriteDemo {

	public static void main(String args[]) throws IOException {
		Properties p = new Properties();
		OutputStream os = new FileOutputStream("data.properties");
		p.setProperty("Username", "abhi");
		p.setProperty("passowrd", "0000");
		
		p.store(os, null);
		
		
	}
}
