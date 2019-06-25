package com.techlabs.calculator;

public class Calculator {

	public int  calculate(int num) {
		if(num%2==0)
			return num*num*num;
		return -1;
	}
	
}
