package com.techlabs.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@SmartPhones
public class MotoSeries {
	public String model;
	public int modelNumber;

	public MotoSeries(String model, int modelNumber) {
		this.model = model;
		this.modelNumber = modelNumber;
	}

	public void display() {
		System.out.println("moto series");
	}
}




