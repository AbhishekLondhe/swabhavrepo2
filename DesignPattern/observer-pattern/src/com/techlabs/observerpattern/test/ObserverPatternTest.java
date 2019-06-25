package com.techlabs.observerpattern.test;

import com.techlabs.observerpattern.Account;
import com.techlabs.observerpattern.EmailObserver;
import com.techlabs.observerpattern.SmsObserver;

public class ObserverPatternTest {

	public static void main(String args[]) {
		Account acc=new Account(10,"abc",2000,"abc@gmail.com");
		acc.addObserver(new EmailObserver());
		acc.addObserver(new SmsObserver());
		acc.withdraw(200);
		
	}
}
