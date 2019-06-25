package com.techlabs.isp.violation;

public class Robot implements IWorker{

	@Override
	public void startWork() {
		System.out.println("robot started working");
	}

	@Override
	public void stopWork() {
		System.out.println("robot stopped working");		
	}

	@Override
	public void startEat() {
		throw new RuntimeException("robot cannot eat"); 
	}

	@Override
	public void stopEat() {
		throw new RuntimeException("robot cannot eat");
	}

	
}
