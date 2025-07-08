/*
 * WAP to find missing number in array
 * int[] arr ={1,2,3,4,5,6,7,8,9,10};
 */

package interview_Coding_Prac;

import java.util.Arrays;

public class FindMissingNumberInArray {
	void missingNum(int[] arr) {
		int[] arr1 = new int[arr.length];
		for(int i=0; i<arr.length;i++) {
			arr1[i] = arr[i];
		}
		Arrays.sort(arr1);
		for(int i=arr1[1];i<arr1[arr.length-1];i++) {
			
		}
	}
	
	public static void main(String[] args) {
		
	}
}
