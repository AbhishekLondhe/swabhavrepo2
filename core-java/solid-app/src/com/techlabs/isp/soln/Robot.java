package com.techlabs.isp.soln;

public class Robot implements IWork {

	@Override
	public void startWork() {
		System.out.println("robot started working");
	}

	@Override
	public void stopWork() {
		System.out.println("robot stopped working");		
	}

}
