package com.techlabs.factorymethod;

class Tesla implements IAutomobile{

	@Override
	public void start() {
		System.out.println("tesla started..");
	}

	@Override
	public void stop() {

		System.out.println("tesla stopped");
	}

	
}
