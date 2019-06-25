package com.techlabs.player;

public class Player {
	private String firstName;
	private String lastName;
	private int age;
	private int pId;
	private static int nextPlayerId;

	static {
		nextPlayerId = 0;
	}

	public Player(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		pId = nextPlayerId += 1;
	}

	public Player(String firstName, String lastName) {
		this(firstName, lastName, 18);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "firstName:" + firstName + " lastName:" + lastName + " age " + age + " " + super.toString();
	}

	public int getPlayerId() {
		return pId;
	}

	public Player getElder(Player p1) {
		if (this.age > p1.age)
			return this;
		else
			return p1;
	}

	@Override
	public boolean equals(Object o) {
		Player p = (Player) o;
		if (this.firstName.equalsIgnoreCase(p.firstName))
			return true;
		return false;
	}
}
