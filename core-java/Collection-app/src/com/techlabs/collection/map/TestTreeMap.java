package com.techlabs.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String args[]) {
		Map<LineItem, LineItem> map=new TreeMap<LineItem, LineItem>();
		LineItem l1=new LineItem(10,"abc",2000,2);
		LineItem l2=new LineItem(10,"abc",2000,2);
		LineItem l3=new LineItem(101,"abc",2000,2);
		map.put(l1, l1);
		map.put(l1, l1);
		map.put(l2, l2);
		map.put(l2, l2);
		//map.put(l3,l3);
		System.out.println(map.size());
	}
}
