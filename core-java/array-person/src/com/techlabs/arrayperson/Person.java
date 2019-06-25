package com.techlabs.arrayperson;

public class Person {
	
		private String name;
		private int age;
		private GenderType gender;
		private float height;
		private float weight;

		public Person(String name, int age, GenderType gender, float height, float weight) {
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.height = height;
			this.weight = weight;
		}

		public Person(String name, int age, GenderType gender) {
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.height = 5.5f;
			this.weight = 60.1f;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public GenderType getGender() {
			return gender;
		}

		public float getHeight() {
			return height;
		}

		public float getWeight() {
			return weight;
		}

		public void doWorkout() {
			this.weight = weight - ((2 * weight) / 100);
		}

		public void eat() {
			this.height = height + ((1 * height) / 100);
			this.weight = weight + ((5 * weight) / 100);
		}

		public float calculateBmi() {
			float bmi = (this.weight /(this.height * this.height));
			return bmi;
		}

		
		public String BMICategory() {
			float bmiValue = calculateBmi();
			if (bmiValue < 18.5)
				return "underweight";
			if (bmiValue < 25)
				return "normal";
			if (bmiValue < 30)
				return "overweight";
			return "obese";
		}
}
