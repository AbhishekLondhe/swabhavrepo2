package com.techlabs.persontest;

import com.techlabs.person.*;

public class PersonTest {
	public static void main(String args[]) {
		Person p1 = new Person("abhishek", 22, GenderType.MALE, 1.65f, 90f);
		Person p2 = new Person("xyz", 24, GenderType.FEMALE);
		display(p1);
		display(p2);
	}

	public static void display(Person p) {
		System.out.println("Name:" + p.getName());
		System.out.println("Age:" + p.getAge());
		System.out.println("Gender:" + p.getGender());
		System.out.println("Height:" + p.getHeight());
		System.out.println("Weight:" + p.getWeight());
		System.out.println("BMI category:" + p.BMICategory());
		System.out.println("");
	}
}
