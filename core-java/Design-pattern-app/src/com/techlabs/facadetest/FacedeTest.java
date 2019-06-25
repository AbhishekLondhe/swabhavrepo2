package com.techlabs.facadetest;

import com.techlabs.facadepattern.ShapeFacade;

public class FacedeTest {

	public static void main(String args[]) {
		ShapeFacade shape=new ShapeFacade();
		shape.drawCircle();
		shape.drawRectangle();
		shape.drawSquare();
	}
}
