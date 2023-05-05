package org.lessons.java;

import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci la base del rettangolo");
		int base = in.nextInt();
		System.out.println("Inserisci l'altezza del rettangolo");
		int height = in.nextInt();
		in.close();
		
		int perimeter = (base + height) * 2 ;
		int area = base * height;
		
		System.out.println("Perimetro = " + perimeter);
		System.out.println("Area = " + area);
	}
}
