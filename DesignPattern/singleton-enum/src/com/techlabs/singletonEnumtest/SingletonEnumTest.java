package com.techlabs.singletonEnumtest;

import com.techlabs.singletonenum.SingletonEnum;

public class SingletonEnumTest {

	public static void main(String args[]) {
		SingletonEnum obj=SingletonEnum.INSTANCE;
		SingletonEnum obj1=SingletonEnum.INSTANCE;
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}
}
