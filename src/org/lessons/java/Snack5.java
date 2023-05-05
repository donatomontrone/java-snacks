package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int val = in.nextInt();
		int sum = 0;
		int sumEven = 0;
		int sumOdd = 0;
		int oddCount = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		Random rnd = new Random();
		for (int i = 0; i < val; i++) {
			
			int randomNum = rnd.nextInt(0,100);
			
			System.out.println("Random" + (i + 1) + ":" + randomNum);
			sum += randomNum;
			
			if (randomNum % 2 == 0) {
				sumEven += randomNum;
			} else {
				oddCount++;
				sumOdd += randomNum;
			}
			
			if(randomNum < min ) {
				min = randomNum;
			};
			if (randomNum > max) {
				max = randomNum;
			};
		}
		
		System.out.println("Somma = " + sum);
		System.out.println("Somma Pari = " + sumEven);
		System.out.println("Media = " + sum / val);
		if (oddCount > 0) {
			System.out.println("Media dispari = " + sumOdd / oddCount);			
		}
		System.out.println("Min = " + min);
		System.out.println("Max = " + max);
		in.close();
	}
}
