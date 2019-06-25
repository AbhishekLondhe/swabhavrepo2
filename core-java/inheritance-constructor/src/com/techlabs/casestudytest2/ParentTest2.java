package com.techlabs.casestudytest2;

import com.techlabs.casestudy2.*;

public class ParentTest2 {

	public static void main(String args[]) {
		Child c1 = new Child();
		System.out.println(" " + c1.getFoo());
		Child c2 = new Child(200);
		System.out.println(" " + c2.getFoo());
	}
}
