package com.techlabs.dependency.case1.business;

import com.techlabs.dependency.case1.dataaccess.ClassB;

public class ClassA {

	ClassB b=new ClassB();
	public ClassA(ClassB b) {
		this.b=b;
	}
	
	public ClassB getClassb() {
		return b;
	}
	
	public void bar() {
		System.out.println("inside class A");
		b.foo();
	}
}
