package com.techlabs.strategypattern;

public class SubOperation implements IOperable {

	@Override
	public int doOperation(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}

}
