package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {
	public static void main(String[] args) {
		Random rnd = new Random();
		Integer[] arrEven = new Integer[10];
		Integer[] arrOdd = new Integer[10];
		int indexOdd = 0;
		int indexEven = 0;
		for(int i = 0; i < 10; i++) {
			
			int num = rnd.nextInt(0,100);
			
			if(num % 2 == 0) {
				arrEven[indexEven++] = num;
			} else {
				arrOdd[indexOdd++] = num;
			}
		}
		System.out.println("Lista pari: " + Arrays.asList(arrEven));

		System.out.println("Lista dispari: " + Arrays.asList(arrOdd));
	}
}
