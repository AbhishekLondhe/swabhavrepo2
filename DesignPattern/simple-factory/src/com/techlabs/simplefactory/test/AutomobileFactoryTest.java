package com.techlabs.simplefactory.test;

import com.techlabs.simplefactory.AutoType;
import com.techlabs.simplefactory.AutomobileFactory;
import com.techlabs.simplefactory.IAutomobile;

public class AutomobileFactoryTest {

	public static void main(String args[]) {
		AutomobileFactory factory=AutomobileFactory.getInstance();
		IAutomobile auto=factory.make(AutoType.BMW);
		auto.start();
		auto.stop();
		IAutomobile auto2=factory.make(AutoType.AUDI);
		auto2.start();
		auto2.stop();
		IAutomobile auto3=factory.make(AutoType.TESLA);
		auto3.start();
		auto3.stop();
	}
}
