package com.techlabs.mantest;

import com.techlabs.man.*;

public class ManTest {
	public static void case1() {
		Man x;
		x = new Man();
		x.play();
		x.read();
		x.walk();
	}
	
	public static void case2() {
		Boy y;
		y=new Boy();
		y.eat();
		y.play();
		y.read();
		y.walk();
	}
	
	public static void case3() {
		Man x;
		x=new Boy();
		x.walk();
		x.play();
		x.read();
	}
	
	public static void atThePark(Man m) {
		
		System.out.println("In the Park");
		m.play();
	}
	
	public static void main(String args[]) {
		
		ManTest.atThePark(new Man());
		ManTest.atThePark(new Boy());
		ManTest.atThePark(new Kid());
		ManTest.atThePark(new Infant());
	}
}
