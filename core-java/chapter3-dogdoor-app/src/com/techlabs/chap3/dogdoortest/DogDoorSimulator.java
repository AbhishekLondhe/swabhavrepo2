package com.techlabs.chap3.dogdoortest;

import com.techlabs.chap3.dogdoor.*;
public class DogDoorSimulator {
	public static void main(String args[]) {
		DogDoor door=new DogDoor();
		BarkRecognizer br=new BarkRecognizer(door);
		Remote remote=new Remote(door);
		System.out.println("Fido starts barking..");
		//simulate the hardware hearing the bark again..
		br.recognise("woof");
		System.out.println("\nFido has gone Outside..");
		System.out.println("\nFido's all done..");

		try {
			Thread.currentThread();
			Thread.sleep(10000);
		}catch(InterruptedException e){}
		System.out.println("...but he's stuck outside!");
		System.out.println("fido starts barking..");
		//simulate the hardware hearing the bark again..
		br.recognise("woof");
		System.out.println("\nFido's back inside..");
	}

}
