package com.techlabs.accounttest;
import com.techlabs.account.*;
public class TestHeadCount {

	
	public static void main(String args[])
	{
		Account a1=new Account("1","xyz",5000);
		System.out.println(Account.headCount());
		Account a2=new Account("2","pqr",4000);
		System.out.println(Account.headCount());
		new Account("3","abc",5000);
		System.out.println(Account.headCount());
	}
}
