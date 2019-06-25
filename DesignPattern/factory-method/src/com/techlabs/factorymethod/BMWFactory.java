package com.techlabs.factorymethod;

public class BMWFactory implements IAutoFactory{
	private static BMWFactory instance=new BMWFactory();
	
	
	private BMWFactory () {}
	
	
	@Override
	public IAutomobile make() {
		return new BMW();
	}

	public static BMWFactory getInstance() {
		return instance;
	}	
}
