package com.techlabs.chap2.dogdoortest;
import com.techlabs.chap2.dogdoor.*;

public class DogDoorSimulator {

	public static void main(String args[]) {
		DogDoor door=new DogDoor();
		Remote remote=new Remote(door);
		System.out.println("Fido barks to go outside..");
		remote.pressButton();
		System.out.println("\nFido has gone Outside..");
		System.out.println("\nFido's all done..");

		try {
			Thread.currentThread().sleep(10000);
		}catch(InterruptedException e){}
		System.out.println("...but he's stuck outside!");
		System.out.println("fido starts barking..");
		System.out.println("...so Gina grabs the reomte control.. ");
		remote.pressButton();
		System.out.println("\nFido's back inside..");
	}
}
