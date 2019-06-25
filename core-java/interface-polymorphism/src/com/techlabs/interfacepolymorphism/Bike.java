package com.techlabs.interfacepolymorphism;

public class Bike implements IMovable{

	@Override
	public void move() {
		System.out.println("bike is moving");
	}
}
