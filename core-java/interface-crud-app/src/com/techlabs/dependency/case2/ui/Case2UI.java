package com.techlabs.dependency.case2.ui;
import com.techlabs.dependency.case2.business.ClassA;
import com.techlabs.dependency.case2.dataaccess.ClassB;

public class Case2UI {

	public static void main(String args[]) {
		ClassA a=new ClassA(new ClassB());
		a.bar();
	}
}
