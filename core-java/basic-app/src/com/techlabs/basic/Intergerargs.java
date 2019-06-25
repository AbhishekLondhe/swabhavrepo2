package com.techlabs.basic;

public class Intergerargs {
	public static void main(String args[])
	{
		System.out.println(args.length);
		int sum = 0,avg = 0;
		for(int i=0;i< args.length; i++)
		{
			sum = sum + Integer.parseInt(args[i]) ;
			avg = sum /args.length;
		}
		//for(String m :args)
		//	System.out.println(m);
		
		System.out.println("sum:" +sum);
		System.out.println("avg:" +avg);
	}
}
