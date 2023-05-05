package org.lessons.java;

import java.util.Scanner;

public class Snack11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci un numero");
		
		int val = in.nextInt();
		
		for (int i = 1; i < val; i++) {
			
			if(val % i == 0) {
				
				System.out.println(i + " è divisibile per " + val);
			}
		}
	}
}
