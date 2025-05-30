/*
 * WAP to get secondMax  number from array without sorting array
 */

package assignments;

import java.util.Arrays;

public class Assignment53 {
	int getSecondMaxNumFromArray(int[] arr) {
		int maxNum= Integer.MIN_VALUE, secondMaxNum= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxNum) {
				secondMaxNum = maxNum;
				maxNum = arr[i];
			}else if(arr[i]>secondMaxNum)
				secondMaxNum = arr[i];
		}
		return secondMaxNum;
	}

	public static void main(String[] args) {
		Assignment53 assignment53 = new Assignment53();
		int[] inputArr = {10, -33, 22, 45, -11, -89};
		System.out.println("Second maximum number in Array "+Arrays.toString(inputArr) +" is-> "+assignment53.getSecondMaxNumFromArray(inputArr));
	}
}