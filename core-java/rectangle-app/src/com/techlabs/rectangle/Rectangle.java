package com.techlabs.rectangle;

public class Rectangle {
	private int height;
	private int width;
	private ColorType color;

	public Rectangle(int height, int width, ColorType color) {
		this.height = height;
		this.width = width;
		this.color = color;
		System.out.println("rectangle created");
	}

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
		this.color = ColorType.RED;
		System.out.println("rectangle created");
	}

	public void setHeight(int newHeight)
	{
		this.height = newHeight;
	}
	

	
	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public ColorType getColor() {
		return color;
	}

	public int calculateArea() {
		int Area = this.height * this.width;
		return Area;
	}

}
