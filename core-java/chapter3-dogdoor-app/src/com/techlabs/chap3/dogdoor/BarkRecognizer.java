package com.techlabs.chap3.dogdoor;

public class BarkRecognizer {

	private DogDoor door;
	public BarkRecognizer(DogDoor door) {
		this.door=door;
	}
	public void recognise(String bark) {
		System.out.println("BarkRecognizer: heard a '"+bark+"'");
		door.open();
	}
}
