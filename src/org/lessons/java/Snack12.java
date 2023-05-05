package org.lessons.java;

import java.util.Arrays;

public class Snack12 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int arr1lnt = arr1.length;
		int arr2lnt = arr2.length;
		
		int arrlnt = arr1lnt + arr2lnt;
		Integer[] arr3 = new Integer[arrlnt];
		
		for (int i = 0; i< arr1lnt; i++) {
			arr3[i] = arr1[i];
		}
		
		for (int i = 0; i< arr2lnt; i++) {
			arr3[arr1lnt+i] = arr2[i];
		}
		
		System.out.println(Arrays.asList(arr3));
	}
}
