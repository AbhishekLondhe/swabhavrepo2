package com.techlabs.dependency.case2.dataaccess;

import com.techlabs.core.IFooable;

public class ClassB implements IFooable{

	@Override
	public void foo() {
		System.out.println("foo called..");
	}
}
