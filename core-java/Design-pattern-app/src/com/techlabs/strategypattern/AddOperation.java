package com.techlabs.strategypattern;

public class AddOperation implements IOperable {

	@Override
	public int doOperation(int num1, int num2) {
		int addition = num1 + num2;
		return addition;
	}

}
