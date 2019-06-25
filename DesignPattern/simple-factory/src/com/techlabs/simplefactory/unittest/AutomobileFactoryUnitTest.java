package com.techlabs.simplefactory.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.simplefactory.AutoType;
import com.techlabs.simplefactory.AutomobileFactory;
import com.techlabs.simplefactory.IAutomobile;

public class AutomobileFactoryUnitTest {

	
	@Test
	public void checkWhetherConcreteClassInstanceIsGettingCorrectOrNot() {
		AutomobileFactory factory=AutomobileFactory.getInstance();
		IAutomobile auto=factory.make(AutoType.BMW);
		String expected="BMW";
		String actual=auto.getClass().getSimpleName();
		assertEquals(expected.toLowerCase(),actual.toLowerCase());
	}
	

}
