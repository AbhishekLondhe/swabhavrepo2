package com.techlabs.circle;

public class Circle {

	private float radius;
	
	public void setRadius(float newRadius)
	{
		radius=newRadius;
	}
	
	public float getRadius()
	{
		return radius;
	}
	
	public float calculateArea()
	{
		float area;
		area =(float) (Math.PI * radius *radius);
		return area;
	}
	public float calculatePerimeter()
	{
		float perimeter;
		perimeter= (float) (Math.PI * 2 * radius);
		return perimeter;
	}
}
