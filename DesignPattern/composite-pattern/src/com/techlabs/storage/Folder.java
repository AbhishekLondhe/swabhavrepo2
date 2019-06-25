package com.techlabs.storage;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.storage.test.TestStorageItem;


public class Folder implements IStorageItem{


	private String name;
	private int size;
	private List<IStorageItem> files;
	private int level;
	private int count=0;
	public Folder(String name) {
		this.name=name;
		files=new ArrayList<IStorageItem>();
	}
	public String getName() {
		return name;
	}
	public List<IStorageItem> getFiles(){
		return files;
	}
	public void addFiles(IStorageItem file) {
		files.add(file);
	}
	
	@Override

	public void display() {
		System.out.println(TestStorageItem.storageBuffer+"==>Folder name:"+name);
		TestStorageItem.storageBuffer.append("    ");
		String storageName=this.getClass().getSimpleName();
		for(IStorageItem item: files) {
			if(storageName.equals("Folder")) {
				item.display();
			}
			if(storageName.equals("File")) {
				item.display();
			}
			size=TestStorageItem.storageBuffer.length();
		}
		TestStorageItem.storageBuffer.setLength(TestStorageItem.storageBuffer.length()-4);
	}
	
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level += level;
	}
	
}

/*
 * 	@Override
	public void display() {
		if(count>level) {
			TestStorageItem.storageBuffer.setLength(TestStorageItem.storageBuffer.length()-5);
			System.out.println(TestStorageItem.storageBuffer+"==>"+name);
		}
		if(count<=level) {
				System.out.println(TestStorageItem.storageBuffer+"==>"+name);
				count++;
		}
		TestStorageItem.storageBuffer.append("    ");
		for(IStorageItem item:files) {
			item.display();
		}
		TestStorageItem.storageBuffer.setLength(TestStorageItem.storageBuffer.length()-4);
	}
	*/
