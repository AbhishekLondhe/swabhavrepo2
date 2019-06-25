package com.techlabs.circletest;
import com.techlabs.circle.*;

public class CircleTest {
	public static void main(String args[])
	{
		Circle big = new Circle();
		
		big.setRadius(14.5f);
		System.out.println("radius:"+big.getRadius());
		System.out.println("area of circle:"+big.calculateArea());
		System.out.println("perimeter of circle"+big.calculatePerimeter());
		
	}
}
