package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class Snack6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci un numero limite");
		int val = in.nextInt();
		
		int sum = 0;
		
		
		while (sum <= val) {
			int rndNum = (int) (Math.random() * 100);
			System.out.println(rndNum);
			sum += rndNum;
		}
		
		System.out.println("Somma :" + sum);
		
		in.close();
	}
}
