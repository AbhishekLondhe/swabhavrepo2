package com.techlabs.html.test;

import com.techlabs.html.Control;
import com.techlabs.html.ControlGroup;

public class HtmlTest {

	public static void main(String args[]) {
		ControlGroup tag1=new ControlGroup("h1");
		tag1.addChildren(new Control("text","input","username"));
		tag1.addChildren(new Control("text","input","password"));
		tag1.addChildren(new Control("text","input","login"));		
		System.out.println(tag1.buildHtml());
	}
}
