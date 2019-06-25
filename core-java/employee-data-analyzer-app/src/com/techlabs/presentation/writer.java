package com.techlabs.presentation;




import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class writer {
	public void writing() {
        try {
            File textFile = new File("C:Users/DELL/Desktop/write.txt");
            FileOutputStream is = new FileOutputStream(textFile);
            OutputStreamWriter osw = new OutputStreamWriter(is);    
            Writer w = new BufferedWriter(osw);
            w.write(display());
            w.write(secondDisplay());
            w.close();
        } catch (IOException e) {
            System.err.println("error");
        }
    }

    public static void main(String[]args) {
        writer write = new writer();
        write.writing();
    }
    
    public static String display() {
    	return "display new line"
    			+ "";
    }
    public static String secondDisplay() {
    	return "display 2";
    }
    }
