package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
		System.out.println("Inserisci un numero");
		
			int val = in.nextInt();
		
	in.close();
	
	System.out.println(
			val % 2 == 0 
			? val
			: val + 1
			);
}
	
}