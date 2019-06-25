package com.techlabs.jframe.onebutton;

public class FileObserver implements IObserver{

	@Override
	public void update() {
		System.out.println("data is added in file");
	}

}
