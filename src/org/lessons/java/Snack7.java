package org.lessons.java;

import java.util.Random;

public class Snack7 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int rndVal = rnd.nextInt(101);
		while(rndVal % 3 != 0 || rndVal % 5 != 0) {
			
			System.out.println(rndVal);
			rndVal = rnd.nextInt(101);
		}
		System.out.println(rndVal);
	}
	
}
