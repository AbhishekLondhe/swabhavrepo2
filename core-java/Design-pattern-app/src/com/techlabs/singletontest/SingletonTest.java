package com.techlabs.singletontest;

import com.techlabs.singleton.Singleton;

public class SingletonTest {

	public static void main(String args[]) {
		Singleton object=Singleton.getInstance();
		object.message();
	}
}
