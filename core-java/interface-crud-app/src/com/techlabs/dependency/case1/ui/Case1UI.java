package com.techlabs.dependency.case1.ui;
import com.techlabs.dependency.case1.business.ClassA;
import com.techlabs.dependency.case1.dataaccess.ClassB;
public class Case1UI {

	public static void main(String args[]) {
		ClassA a=new ClassA(new ClassB());
		a.bar();
	}
}
