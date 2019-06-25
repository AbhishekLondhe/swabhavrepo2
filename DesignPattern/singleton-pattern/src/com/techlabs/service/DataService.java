package com.techlabs.service;

public class DataService {

	private static DataService instance;
	
	private DataService() {
		System.out.println("service created");
	}
	
	public void doSomething() {
		System.out.println("done something..");
	}
	public static DataService getInstance() {
		if(instance==null) {
			return instance=new DataService();
		}
		return instance;
		
	}
}
