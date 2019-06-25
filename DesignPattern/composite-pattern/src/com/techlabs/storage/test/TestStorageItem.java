package com.techlabs.storage.test;

import com.techlabs.storage.File;
import com.techlabs.storage.Folder;

public class TestStorageItem {

	public static StringBuffer storageBuffer=new StringBuffer();
	public static void main(String args[]){

		Folder f1=new Folder("Movies");
		f1.addFiles(new File(100,"abc","mp4"));
		f1.addFiles(new File(200,"pqr","mp4"));
		Folder f2=new Folder("Songs");
		f1.addFiles(f2);
		f2.addFiles(new File(20,"xyz","mp3"));
		f2.addFiles(new File(30,"stu","avi"));
		Folder f3=new Folder("pictures");
		f2.addFiles(f3);
		f3.addFiles(new File(22,"def","png"));
		Folder f4=new Folder("images");
		f2.addFiles(f4);
		f1.display();
		
	}
}
