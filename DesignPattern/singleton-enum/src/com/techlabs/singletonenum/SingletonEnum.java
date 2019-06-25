package com.techlabs.singletonenum;

public enum SingletonEnum {

	INSTANCE;
	
	int value;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value=value;
	}
	public static void doSomething() {
		System.out.println("done something");
	}
}
