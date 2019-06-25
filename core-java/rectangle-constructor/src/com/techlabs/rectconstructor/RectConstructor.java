package com.techlabs.rectconstructor;

public class RectConstructor {

	private int height;
	private int width;
	private int area;

	public RectConstructor(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public RectConstructor() {
		this.height = 10;
		this.width = 10;
	}
	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int calculateArea() {
		area = this.height * this.width;
		return area;
	}
	
}
