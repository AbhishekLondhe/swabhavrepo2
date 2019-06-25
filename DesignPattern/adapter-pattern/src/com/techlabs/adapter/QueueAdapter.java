package com.techlabs.adapter;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueAdapter<T> implements IQueue{

	private LinkedList<T> queue;

	public QueueAdapter(){
		queue=new LinkedList<T>();
	}
	
	@Override
	public void enqueue(Object item) {
		queue.addLast((T) item);
	}

	@Override
	public Object dequeue() {
		return queue.removeFirst();
	}

	@Override
	public int count() {
		return queue.size();
	}
	
	public LinkedList<T> getLinkedList(){
		return queue;
	}

	@Override
	public Iterator<T> iterator() {
		return queue.iterator();
	}
}
