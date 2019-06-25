package com.techlabs.test;

import com.techlabs.rectangle.Rectangle;

public class TestArray {
	public static void main(String args[]) {
		Rectangle[] rect = new Rectangle[3];

		rect[0] = new Rectangle(10, 20);
		rect[1] = new Rectangle(20, 30);
		rect[2] = new Rectangle(30, 40);

		int r = 0;
		while (r < rect.length) {

			System.out.println("object" + r);
			System.out.println("height->" + rect[r].getHeight() + " & width->" + rect[r].getWidth());
			System.out.println("area of rectangle:" + rect[r].calculateArea());
			r++;
		}
	}
}
