package com.techlabs.codemagnet;

public class TestArrays {
	public static void main(String args[])
	{
		int y=0;
		String islands[] = new String[4];
		int index[] = new int[4];
		int ref;
		index[0]= 1;
		index[1]= 3;
		index[2]= 0;
		index[3]= 2;
		islands[0]= "bermuda";
		islands[1]= "fiji";
		islands[2]= "azores";
		islands[3]= "cozumel";
		while(y < 4)
		{
			ref=index[y];
			System.out.print("island = ");
			System.out.println(islands[ref]);
			y=y+1;
		}
	}
}
