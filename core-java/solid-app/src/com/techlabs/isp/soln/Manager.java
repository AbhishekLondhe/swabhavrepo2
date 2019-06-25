package com.techlabs.isp.soln;

public class Manager implements IWorkEat{

	@Override
	public void startWork() {
		System.out.println("manager started working");
	}

	@Override
	public void stopWork() {
		System.out.println("manager stopped working");		
	}

	@Override
	public void startEat() {
		System.out.println("manager started eating");		
	}

	@Override
	public void stopEat() {
		System.out.println("manager stopped eating");		
	}

}
