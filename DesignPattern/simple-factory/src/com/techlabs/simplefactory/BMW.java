package com.techlabs.simplefactory;

 class BMW implements IAutomobile{

	@Override
	public void start() {
		System.out.println("BMW started..");
	}

	@Override
	public void stop() {

		System.out.println("BMW stopped..");
	}

	
}
