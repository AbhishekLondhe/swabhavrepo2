package com.techlabs.storage;

import com.techlabs.storage.test.TestStorageItem;

public class File implements IStorageItem{

	private int size;
	private String name;
	private String extensions;
	
	public File(int size,String name,String extensions) {
		this.size=size;
		this.name=name;
		this.extensions=extensions;
	}

	public int getSize() {
		return size;
	}

	public String getName() {
		return name;
	}

	public String getExtension() {
		return extensions;
	}

	@Override
	public void display() { 
		System.out.print(TestStorageItem.storageBuffer+"==>file size:"+size+" file name:"+name+" file extension:"+extensions+"\n");
	}
}
