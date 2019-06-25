package com.techlabs.strategytest;

import com.techlabs.strategypattern.AddOperation;
import com.techlabs.strategypattern.MultiOperation;
import com.techlabs.strategypattern.Strategy;
import com.techlabs.strategypattern.SubOperation;

public class StrategyTest {

	public static void main(String args[]) {
		Strategy addStrategy = new Strategy(new AddOperation());
		System.out.println("10 + 5:" + addStrategy.executeOperations(10, 5));
		Strategy subStrategy = new Strategy(new SubOperation());
		System.out.println("20 - 12:" + subStrategy.executeOperations(20, 12));
		Strategy multiStrategy = new Strategy(new MultiOperation());
		System.out.println("15 * 20:" + multiStrategy.executeOperations(15, 20));
	}
}
