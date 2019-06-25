package com.techlabs.strategypattern;

public class MultiOperation implements IOperable {

	@Override
	public int doOperation(int num1, int num2) {
		int multi = num1 * num2;
		return multi;
	}

}
