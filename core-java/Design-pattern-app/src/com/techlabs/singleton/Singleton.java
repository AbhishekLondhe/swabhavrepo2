package com.techlabs.singleton;

public class Singleton {

	public static Singleton instance=new Singleton();
	private Singleton(){}
	public static Singleton getInstance() {
		return instance;
	}
	
	public void message() {
		System.out.println("singleton pattern");
	}
}
