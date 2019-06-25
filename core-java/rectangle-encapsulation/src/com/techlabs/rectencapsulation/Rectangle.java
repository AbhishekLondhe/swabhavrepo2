package com.techlabs.rectencapsulation;

public class Rectangle {

	private int height;
	private int width;
	private String color;

	public void  setWidth(int newWidth)
	{
		width = validate(newWidth);
	}
	
	public void  setHeight(int newHeight)
	{
		height = validate(newHeight);
	}
	
	public void setColor(String newColor)
	{
		if(newColor.equalsIgnoreCase("blue") || newColor.equalsIgnoreCase("green") || newColor.equalsIgnoreCase("red") )
			color = newColor;
		else
			color ="red"; 
	}
	public String getColor()
	{
		return color;
	}
	
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}
	
	public int calculateArea()
	{
		int area=0;
		area = height * width;
		return area ;
	}	

	private int validate(int value)
	{
		if(value > 100)
			return 100;
		else if(value < 1)
			return 1;
		else
			return value;
	}
}
