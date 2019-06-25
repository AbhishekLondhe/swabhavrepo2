package com.techlabs.simplefactory;

public class AutomobileFactory {

	private static AutomobileFactory instance=new AutomobileFactory();
	
	private AutomobileFactory() {}
	public IAutomobile make(AutoType autoType) {
		if(autoType==AutoType.BMW) {
			return new BMW();
		}
		if(autoType==AutoType.TESLA) {
			return new Tesla();
		}
		if(autoType==AutoType.AUDI) {
			return new Audi();
		}
		return null;
	}
	public static AutomobileFactory getInstance() {
		return instance;
	}
}
