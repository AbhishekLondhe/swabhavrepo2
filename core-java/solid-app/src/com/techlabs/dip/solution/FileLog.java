package com.techlabs.dip.solution;

public class FileLog implements ILog {

	@Override
	public void log(String msg) {

		System.out.println(msg+" file log error");
	}
}
