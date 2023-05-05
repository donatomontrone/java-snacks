package org.lessons.java;

import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {
		String[] names = {
				"Donato",
				"Marco",
				"Filippo",
				"Antonio",
				"Giada",
				"Giovanna",
				"Alessia",
				"Gabriella"
		};
		String[] surnames = {
				"Disit",
				"Rossi",
				"Verdi",
				"Scari",
				"Giada",
				"Lassi",
				"Cappesi",
				"Notti"
		};
		
		int namesLnt = names.length;
		
		Random rnd = new Random();
		for (int i = 0; i < namesLnt; i++) {
			int val1 = rnd.nextInt(namesLnt);
			int val2 = rnd.nextInt(namesLnt);
			
			String newPerson = names[val1] + " " + surnames[val2];
			
			System.out.println(newPerson);
		}
	}
}
