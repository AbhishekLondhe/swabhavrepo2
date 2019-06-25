package com.techlabs.guitartest;

import java.util.Iterator;
import java.util.List;

import com.techlabs.guitar.*;

public class FindGuitarTest {

	public static void main(String args[]) {
		Inventory inventory = new Inventory();
		initialiseInventory(inventory);

		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER,"stratocastor",Type.ELECTRIC, 12, Wood.ALDER, Wood.ALDER);
		
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				GuitarSpec spec = guitar.getSpec();

				System.out.println("Erin, you might like this "
						+ spec.getBuilder() + " " + spec.getModel() + " "
						+ spec.getType() + " guitar:\n" + spec.getBackWood()
						+ " back and sides,\n " + spec.getTopWood()
						+ " top.\nYou can have it for only $"
						+ guitar.getPrice() + "!\n");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

	public static void initialiseInventory(Inventory inventory) {

		inventory.addGuitar("V95693", 1499.95,new GuitarSpec(Builder.FENDER,"stratocastor", Type.ELECTRIC,12,Wood.ALDER, Wood.ALDER));
		inventory.addGuitar("V9512",1549.95, new GuitarSpec(Builder.FENDER,"stratocastor", Type.ELECTRIC,12,Wood.ALDER, Wood.ALDER));
	}
}
