package com.techlabs.basic;

public class TestParameters {
	public static void main(String args[]) {
		int mark = 10;
		updateMarkToZero(mark);
		System.out.println(mark);
		int[] marks = { 10, 20, 30 };
		updateMarksToZero(marks);
		for (int m : marks)
			System.out.println(m);
	}

	public static void updateMarkToZero(int m) {
		m = 0;
	}

	public static void updateMarksToZero(int[] m) {
		for (int i = 0; i < m.length; i++)
			m[i] = 0;
	}

}
