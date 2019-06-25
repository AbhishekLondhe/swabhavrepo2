package com.techlabs.factorymethod;

public class AudiFactory implements IAutoFactory {

	private static AudiFactory instance=new AudiFactory();
	
	
	private AudiFactory () {}
	@Override
	public IAutomobile make() {
		
		return new Tesla();
	}

	public static AudiFactory getInstance() {
		return instance;
	}
	
}
