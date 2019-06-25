package com.techlabs.rectconstructortest;

import com.techlabs.rectconstructor.*;

public class RectConstructorTest {

	public static void main(String args[]) {
		RectConstructor r1 = new RectConstructor(20, 30);
		display(r1);
		RectConstructor r2 = new RectConstructor();
		display(r2);
	}

	public static void display(RectConstructor r) {
		System.out.println("Height:"+r.getHeight());
		System.out.println("Width"+r.getWidth());
		System.out.println("Area:"+r.calculateArea());
		System.out.println("");
	}
}
