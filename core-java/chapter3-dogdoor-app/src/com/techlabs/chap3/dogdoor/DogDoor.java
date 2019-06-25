package com.techlabs.chap3.dogdoor;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean open;
	public DogDoor() {
		this.open=false;
	}
	
	public void open() {
		System.out.println("The Dog Door is opens..");
		this.open=true;
		Timer timer=new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
	}
	
	public void close() {
		System.out.println("The Dog Door is closes.. ");
		this.open=false;
	}
	public boolean isOpen() {
		return open;
	}
}
