package com.techlabs.adapter.test;

import java.util.LinkedList;

import com.techlabs.adapter.IQueue;
import com.techlabs.adapter.QueueAdapter;

public class TestAdapter {

	public static void main(String args[]) {
		IQueue<Integer> queue1=new QueueAdapter<Integer>();
		queue1.enqueue(10);
		queue1.enqueue(20);
		queue1.enqueue(30);
		queue1.enqueue(40);
		System.out.println(queue1.count());
		System.out.println("dequue:"+queue1.dequeue());
		System.out.println(queue1.count());
		for( Integer item:queue1) {
			System.out.println(item);
		}
	}
}
