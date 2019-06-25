package com.techlabs.abstractapp;

public class FamilyDoctor extends Doctor {

	public void display() {
		System.out.println("abstract method ...");
	}

	public void show() {
		System.out.println("Family doctor class");
		super.show();
	}

}
