package com.techlabs.interfacepolymorphismtest;


import com.techlabs.interfacepolymorphism.*;
public class InterfacePolyTest {

	public static void main(String args[]) {
		
		IMovable arr[]=new IMovable[3];
		arr[0]=new Car();
		arr[1]=new Truck();
		arr[2]=new Bike();
		printDetails(arr);
	}
	
	public static void printDetails(IMovable obj[]) {
		System.out.println("race is started..");
		for(IMovable i:obj) {
			i.move();
		}
		System.out.println("race is ended..");
	}
}
