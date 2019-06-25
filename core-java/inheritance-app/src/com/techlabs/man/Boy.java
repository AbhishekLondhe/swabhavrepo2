package com.techlabs.man;

public class Boy extends Man{

	public void eat() {
		System.out.println("boy is eating");
	}
	@Override
	public void play() {
		System.out.println("boy is playing");
	}
	@Override
	public void read() {
		System.out.println("boy is reading");
	}
	@Override
	public void walk() {
		System.out.println("boy is walking");
	}
}
