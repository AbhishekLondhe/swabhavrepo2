package com.techlabs.strategypattern;

public class Strategy {

	private IOperable iOperable;
	public Strategy(IOperable iOperable) {
		this.iOperable=iOperable;
	}
	public IOperable getIOperable() {
		return iOperable;
	}
	public int executeOperations(int num1,int num2) {
		return iOperable.doOperation(num1,num2);
	}
}
