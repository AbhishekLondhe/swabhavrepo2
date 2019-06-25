package com.techlabs.codemagnet;

public class Playsnare {
	public static void main(String args[])
	{
		DrumKit d=new DrumKit();
		d.snare=false;
		if(d.snare)
		{
			d.playSnare();
		}
		d.playSnare();
		d.playTopHat();
	}
}
class DrumKit
{
	boolean topHat = true;
	boolean snare = true;
	void playSnare() 
	{
		System.out.println("bang bang ba-bang");
	}
	void playTopHat()
	{
		System.out.println("ding ding da-ding");
	}

}