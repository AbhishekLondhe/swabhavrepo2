package com.techlabs.assignment;

public class Urldisplay {
	public static void main(String args[]) 
	{
    	System.out.println(args[0]);
    	int urlStart = args[0].indexOf("www.");
    	int urlEnd = args[0].indexOf(".com");
    	int developer = args[0].indexOf("developer=");
    	int andSign =args[0].indexOf("&");
    	String url = args[0].substring(urlStart + 4, urlEnd);
    	String devName =args[0].substring(developer + 10, andSign -1);
    	String companyName=args[0].substring(andSign + 10, args[0].length() );
    	System.out.println(url);
    	System.out.println(devName);
    	System.out.println(companyName);
    	
    	
    	//String[] split = args[0].split("[.?&]");
    	//System.out.println(split[1]);
    	//System.out.println(split[3].substring(11));
    	//System.out.println(split[4].substring(9));

    	//System.out.println(split[2]);
    	//System.out.println(split[2]);
    	//System.out.println("domain= "+split[1]);
	}
}
