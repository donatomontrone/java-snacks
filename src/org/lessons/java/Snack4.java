package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Inserisci una parola");
	String word = in.nextLine();
	in.close();
	
	int wordLnt = word.length();
	String reverse = "";
	for (int i = wordLnt - 1; i >= 0; i--) {
		reverse += word.charAt(i);
	}
	
	System.out.println(
			reverse.equals(word)
			? "Parola palindorma" 
			: "Parola non palindroma"
				);
	}
}
//			int strLng = str.length();
//			for (int x=0; x<strLng/2; x++) {
//			int revInd = strLng - x - 1;
//				if (str.charAt(x) != str.charAt(revInd)) {
//					System.out.printIn("non e' palindroma");
//					return;
//				}
//			}
//			System.out.print]n("e' palindroma");
