package com.techlabs.factorytest;

import com.techlabs.factorypattern.IShape;
import com.techlabs.factorypattern.ShapeFactory;

public class FactoryTest {

	public static void main(String args[]) {
		ShapeFactory shapeFactory=new ShapeFactory();
		IShape shape1=shapeFactory.getShape("circle");
		shape1.draw();
		IShape shape2=shapeFactory.getShape("rectangle");
		shape2.draw();
		IShape shape3=shapeFactory.getShape("square");
		shape3.draw();
	}
}
