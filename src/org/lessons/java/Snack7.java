package org.lessons.java;

public class Snack7 {
	public static void main(String[] args) {
		int x = 0;

		do {
			x++;
			System.out.println(x);
		} while (!(x % 3 == 0 && x % 5 == 0));
	}
}
