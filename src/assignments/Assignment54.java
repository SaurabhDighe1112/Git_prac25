/*
 * WAP to get positive numbers from array
 * input: {10, -33, 22, 45, -11, -89};
 */


package assignments;

import java.util.Arrays;

public class Assignment54 {
	int getPositiveNumCount(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				count++;
		}
		return count;
	}
	
	int[] getPositiveNumArray(int[] arr) {
		int positiveNum = getPositiveNumCount(arr);
		int[] positiveNumArr = new int[positiveNum];
		for(int i=0, j=0;i<arr.length;i++) {
			if(arr[i]>0) {
				positiveNumArr[j]= arr[i];
				j++;
			}
		}
		return positiveNumArr;
	}
	
	public static void main(String[] args) {
		Assignment54 assignment54 = new Assignment54();
		int[] input= {10, -33, 22, 45, -11, -89};
		System.out.println(Arrays.toString(assignment54.getPositiveNumArray(input)));
	}
}
