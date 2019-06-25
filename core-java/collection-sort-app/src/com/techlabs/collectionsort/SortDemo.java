package com.techlabs.collectionsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	
	public static void main(String args[]) {
		
		
		List<String> fruit=new ArrayList<String>();
		fruit.add("apple");
		fruit.add("banana");
		fruit.add("orange");
		fruit.add("mango");
		fruit.add("watermelon");
		fruit.add("tomato");
		
		Collections.sort(fruit);
		System.out.println(fruit);
		Collections.sort(fruit, Collections.reverseOrder());
		System.out.println(fruit);
	}
}
