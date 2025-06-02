/*
 * WAP to get count of numbers present in each word in given array and return count in new array
 * input: {"tech2n4o","c1red1its","hello","7h6i666"};
 */

package assignments;

import java.util.Arrays;

public class Assignment61 {
	int getDigitCountInString(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	
	int[] getDigitCountArray(String[] arr) {
		int[] output = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			output[i] = getDigitCountInString(arr[i]);
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment61 assignment61 = new Assignment61();
		String[] inputArr = {"tech2n4o","c1red1its","hello","7h6i666"};
		System.out.println(Arrays.toString(assignment61.getDigitCountArray(inputArr)));
	}
}
