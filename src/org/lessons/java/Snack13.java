package org.lessons.java;

import java.util.Arrays;

public class Snack13 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int arr1lnt = arr1.length;
		int arr2lnt = arr2.length;
		
		Integer[] swapArr1 = new Integer[arr1lnt];
		Integer[] swapArr2 = new Integer[arr2lnt];

		
		swapArr1[0] = arr2[0];
		swapArr2[0] = arr1[0];
		for (int i = 1; i< arr1lnt; i++) {
			swapArr1[i] = arr1[i];
		}
		
		for (int i = 1; i< arr2lnt; i++) {
			swapArr2[i] = arr2[i];
		}
		
		System.out.println(Arrays.asList(swapArr1));
		System.out.println(Arrays.asList(swapArr2));
	}
}
