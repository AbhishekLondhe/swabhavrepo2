package com.techlabs.rectencaptest;
import com.techlabs.rectencapsulation.*;
public class RectEncapsTest {
	public static void main(String args[])
	{
	Rectangle big= new Rectangle();
	Rectangle small= new Rectangle();
	
	big.setHeight(10);
	big.setWidth(50);
	big.setColor("bluE");
	small.setHeight(5);
	small.setWidth(10);
	small.setColor("oranGe");
	System.out.println(big.getHeight()+" "+big.getWidth()+" "+big.getColor());
	System.out.println(small.getHeight()+" "+small.getWidth()+" "+small.getColor());
	System.out.println("big rectangle area:"+big.calculateArea());
	System.out.println("small rectangle area:"+small.calculateArea());	
	}	
}
