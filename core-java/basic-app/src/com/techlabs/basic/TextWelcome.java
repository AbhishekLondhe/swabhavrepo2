package com.techlabs.basic;

public class TextWelcome {
	public static void main(String args[])
	{
		System.out.println("hello"); //string
		System.out.println(3.75f);
		System.out.println(3);
		char c='m';
		System.out.println(c);
		System.out.println(false);
		printThis(47);
		printThis(10.5f);
		printThis("hello");
		printThis('c');
		printThis(false);
		
		
	}
	public static void printThis(int number)
	{
		System.out.println(number);
		System.out.println("overloading 1");
	}
	
	public static void printThis(float number)
	{
		System.out.println(number);
		System.out.println("overloading 2");
	}
	
	public static void printThis(String string1)
	{
		System.out.println(string1);
		System.out.println("overloading 3");
	}
	
	public static void printThis(char value)
	{
		System.out.println(value);
		System.out.println("overloading 4");
	}
	
	public static void printThis(boolean b) 
	{
		System.out.println(b);
		System.out.println("overloading 5");
	}
}
