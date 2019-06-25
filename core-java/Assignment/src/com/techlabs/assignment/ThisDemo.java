package com.techlabs.assignment;

public class ThisDemo {
	int id;
	
	public ThisDemo(int id){
		this.id = id;
	}
	
	
	public void display() {
		System.out.println(id);
	}
	public static void main(String args[])
	{
		ThisDemo a = new ThisDemo(10);
		a.display();
	}
}
