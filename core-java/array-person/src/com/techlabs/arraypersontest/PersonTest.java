package com.techlabs.arraypersontest;

import com.techlabs.arrayperson.*;
import com.techlabs.arrayperson.GenderType;

public class PersonTest {

	public static void main(String[] args) {

		Person p[] = new Person[3];
		p[0] = new Person("xyz", 26, GenderType.MALE, 1.70f, 90f);
		p[1] = new Person("pqr", 22, GenderType.FEMALE, 1.75f, 100f);
		p[2] = new Person("abc", 29, GenderType.MALE, 1.65f, 90f);

		int r = 0;
		while (r < p.length) {

			System.out.println("bmi"+p[r].BMICategory());
			r++;
		}

	}
}
