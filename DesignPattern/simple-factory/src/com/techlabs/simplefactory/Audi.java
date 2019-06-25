package com.techlabs.simplefactory;

class Audi implements IAutomobile{

	@Override
	public void start() {
		System.out.println("audi started..");
	}

	@Override
	public void stop() {
		System.out.println("audi stopped..");
	}

	
}
