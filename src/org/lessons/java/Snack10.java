package org.lessons.java;

import java.util.Scanner;

public class Snack10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci il raggio del rettangolo");
		int radius = in.nextInt();

		in.close();
		
		float perimeter = 2 * radius * 3.14f;
		float area = radius * radius * 3.14f;
		
		System.out.println("Perimetro = " + String.format("%.2f", perimeter));
		System.out.println("Area = " + String.format("%.2f", area));
	}
}
