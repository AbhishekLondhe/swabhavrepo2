package com.techlabs.dip.solution;

public class DbLog implements ILog{

	@Override
	public void log(String msg) {
		System.out.println(msg+" DB log Error");		
	}
}
