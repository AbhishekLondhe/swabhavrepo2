package com.techlabs.annotationtest;

import java.lang.annotation.Annotation;
import com.techlabs.annotation.*;

public class AnnotationTest {
	public static void main(String args[]) {

		MotoSeries m = new Lenevo("g5 series", 6);
		show(m);
		Class cls = m.getClass();
		Annotation an = cls.getAnnotation(SmartPhones.class);
		System.out.println(an);
	}

	public static void show(MotoSeries obj) {
		System.out.println("model:" + obj.model);
		System.out.print(" model Number:" + obj.modelNumber);
		obj.display();
	}
}
