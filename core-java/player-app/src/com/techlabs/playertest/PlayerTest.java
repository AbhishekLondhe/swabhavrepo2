package com.techlabs.playertest;

import com.techlabs.player.Player;

public class PlayerTest {

	public static void main(String args[]) {
		Player p1 = new Player("abc", "xyz", 22);
		display(p1);
		Player p2 = new Player("pqr", "mno");
		display(p2);
		Player p3 = p1.getElder(p2);
		display(p3);
		}

	public static void display(Player p) {
		System.out.print("\nfirstName:" + p.getFirstName());
		System.out.print(" lastName:" + p.getLastName());
		System.out.print(" age:" + p.getAge());
		System.out.print(" playerId:" + p.getPlayerId());
		System.out.println(" hashcode:" + p.hashCode());
	}
}
