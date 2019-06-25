package com.techlabs.dependency.case2.business;

import com.techlabs.core.IFooable;

public class ClassA {

private IFooable obj;

public ClassA(IFooable obj) {
	this.obj=obj;
}
	public void bar() {
		System.out.println("inside class A");
		obj.foo();
	}
}
