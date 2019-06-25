package com.techlabs.interfacepolymorphism;

public class Truck implements IMovable{

	@Override
	public void move() {
		System.out.println("truck is moving");
	}
}
