package com.techlabs.factorypattern;

public class Rectangle implements IShape{

	@Override
	public void draw() {
		System.out.println("inside rectangle");
	}
}
