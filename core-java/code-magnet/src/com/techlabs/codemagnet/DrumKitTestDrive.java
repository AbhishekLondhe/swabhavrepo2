package com.techlabs.codemagnet;

class DrumKits
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

public class DrumKitTestDrive {
	public static void main(String args[])
	{
		DrumKits d = new DrumKits();
		d.snare=false;
		if(d.snare)
		{
			d.playSnare();
		}
		d.playSnare();
		d.playTopHat();
	}

}


