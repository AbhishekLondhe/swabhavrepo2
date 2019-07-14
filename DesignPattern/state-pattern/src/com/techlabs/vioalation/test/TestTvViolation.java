package com.techlabs.vioalation.test;

import com.techlabs.violation.TvService;

public class TestTvViolation {

	public static void main(String args[]) {
		TvService ts=new TvService();
		ts.setState("on");
		ts.doAction();
		ts.setState("off");
		ts.doAction();
	}
}
