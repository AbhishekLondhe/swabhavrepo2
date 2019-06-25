package com.techlabs.factorymethod;

public class TeslaFactory implements IAutoFactory {

	private static TeslaFactory instance=new TeslaFactory();
	
	
	private TeslaFactory () {}
	@Override
	public IAutomobile make() {
		
		return new Tesla();
	}

	public static TeslaFactory getInstance() {
		return instance;
	}
}
