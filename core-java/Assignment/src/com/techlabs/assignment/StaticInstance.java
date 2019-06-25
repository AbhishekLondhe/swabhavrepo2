package com.techlabs.assignment;

public class StaticInstance {

	private int i=2;
	private static int j=3;
	public static void show()
	{
		System.out.println("hello static method!!!!");
		System.out.println(j);
	}
	
	public void display() {
		System.out.println("hello nonstatic method!!!");
		System.out.println(i+" "+j);
	}
}
