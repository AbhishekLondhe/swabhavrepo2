package com.techlabs.calculatortest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.techlabs.calculator.*;
public class calculatorTest {	
		@Test
		public void checkNumIsEvenOrNot() {
			Calculator calci=new Calculator();
			int actual=calci.calculate(2);
			int expected=8;
			assertEquals(expected,actual);
		}
	}
