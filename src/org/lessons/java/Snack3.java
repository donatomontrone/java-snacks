package org.lessons.java;

public class Snack3 {
public static void main(String[] args) {
	int[] nums = {1,2,3,4,5,6,7,8};
	int sum = 0;
	for (int i = 0; i < nums.length; i++) {
		if(i % 2 == 0) {
			sum += nums[i];
		}
	}
	
	System.out.println(sum);

}
}
