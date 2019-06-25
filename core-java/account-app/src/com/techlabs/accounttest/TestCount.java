package com.techlabs.accounttest;
import com.techlabs.account.*;
public class TestCount {

	public static void main(String args[]) {
		Account acc1=new Account("1","xyz");
		System.out.println("count "+acc1.getCount());
		Account acc2 = new Account("2","abc",5000);
		System.out.println("count "+acc2.getCount());
		Account acc3=new Account("2","abc",4000);
		System.out.println("count "+acc2.getCount());
	}
}
