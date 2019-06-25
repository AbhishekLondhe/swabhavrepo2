package com.techlabs.test;

import com.techlabs.rectangle.*;

public class RectangleTest {
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle(20, 30, ColorType.BLUE);
		display(r1);

		Rectangle r2 = new Rectangle(40, 55);
		display(r2);

		Rectangle r3;
		r3 = r1;
		System.out.println("r3 height:" + r3.getHeight());
		System.out.println("r1 height:" + r1.getHeight());
		r3.setHeight(11);
		System.out.println(r3.getHeight());
		System.out.println(r1.getHeight());
		System.out.println(new Rectangle(10, 20, ColorType.RED).calculateArea());
		display(new Rectangle(10, 20));
	}

	public static void display(Rectangle r) {
		System.out.println("height: " + r.getHeight());
		System.out.println("width: " + r.getWidth());
		System.out.println("Color: " + r.getColor());
		System.out.println("area:" + r.calculateArea());
		System.out.println("");
	}
}
