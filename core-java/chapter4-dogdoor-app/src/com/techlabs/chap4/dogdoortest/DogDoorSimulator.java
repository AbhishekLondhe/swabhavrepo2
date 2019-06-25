package com.techlabs.chap4.dogdoortest;

import com.techlabs.chap4.dogdoor.*;

public class DogDoorSimulator {
	public static void main(String args[]) {
		DogDoor door=new DogDoor();
		door.addAllowedBark(new Bark("rowlf"));
		door.addAllowedBark(new Bark("rooowlf"));
		door.addAllowedBark(new Bark("rawlf"));	
		door.addAllowedBark(new Bark("woof"));
		BarkRecognizer recognizer=new BarkRecognizer(door);
		Remote remote=new Remote(door);
		
		//simulate the hardware hearing the bark again..
		System.out.println("Bruce starts barking..");
		recognizer.recognise(new Bark("rowlf"));
		
		System.out.println("\nBruce has gone Outside..");

		try {
			Thread.currentThread();
			Thread.sleep(10000);
		}catch(InterruptedException e){}
		System.out.println("\nFido's all done..");
		System.out.println("...but he's stuck outside!");
		
		//simulate the hardware hearing the bark again..
		Bark smallDogBark =new Bark("yip");
		System.out.println("small dog starts barking..");
		recognizer.recognise(smallDogBark);
		try {
			Thread.currentThread().sleep(5000);
		}catch(InterruptedException e){}
		//simulate the hardware hearing the bark again..
		System.out.println("\nbruce starts barking.");
		recognizer.recognise(new Bark("rooowlf"));
		System.out.println("\n bruce's back inside...");
		
	}

}
