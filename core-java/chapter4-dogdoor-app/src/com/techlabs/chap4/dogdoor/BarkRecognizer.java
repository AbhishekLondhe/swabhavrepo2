package com.techlabs.chap4.dogdoor;

import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {
	private DogDoor door;
	public BarkRecognizer(DogDoor door) {
		this.door=door;
	}
	public void recognise(Bark bark) {
		System.out.println("BarkRecognizer heard a '"+bark.getSound()+"'");
		List allowedBarks=(List) door.getAllowedBarks();
		for(Iterator i= allowedBarks.iterator();i.hasNext();) {
			Bark allowedBark=(Bark)i.next();
			if(allowedBark.equals(bark)) {
				door.open();
				return;
			}
		}
		System.out.println("this dog is not allowed..");
	}
}
