package com.techlabs.playertest;
import java.lang.reflect.*;
import com.techlabs.player.*;
public class TestToString {

	public static void main(String args[]) {
		Player p1=new Player("abc","xyz",18);
		System.out.println(p1.toString());
		System.out.println(p1);
		
		
	}
}
