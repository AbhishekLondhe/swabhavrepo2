package com.techlabs.basic;

public class TestArrs {
	public static void main(String args[])
	{
		System.out.println(args.length);
		if(args.length < 1 )
			System.out.println("pass value");
		else if(args.length >= 1)	
			for(int i = 0 ; i < args.length ; i++)
				System.out.println(args[i]+" Hello");
	}
}
