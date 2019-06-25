package com.techlabs.customexceptiontest;

import com.techlabs.customexception.InvalidAgeException;

public class CustomeExceptionTest {

	public static void main(String args[]) {
	
		try {
			validate(10);
		}
		catch(Exception e){
			e.printStackTrace();
		}
}	
	public static void validate(int age) throws InvalidAgeException{
		if(age < 18)
			throw new InvalidAgeException(age+" is not valid");
		else 
			System.out.println("valid..");
	}
}

