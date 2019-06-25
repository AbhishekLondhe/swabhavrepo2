package com.techlabs.service.test;

import com.techlabs.service.DataService;

public class TestDataService {

	public static void main(String args[]) {
		
		DataService service1=DataService.getInstance();
		DataService service2=DataService.getInstance();
		
		System.out.println(service1.hashCode());
		System.out.println(service2.hashCode());
		
		service1.doSomething();
		service2.doSomething();
	}
}
