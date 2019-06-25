package com.techlabs.interfacepolymorphism;

public class Car implements IMovable{

	@Override
	public void move() {
		System.out.println("car is moving");
	}
}
