package com.techlabs.annotation;

public class Lenevo extends MotoSeries{

		public Lenevo(String model, int modelNumber) {
			super(model, modelNumber);
		}

		@Override
		public void display() {
			System.out.println("\nlenevo ");
		}
}
