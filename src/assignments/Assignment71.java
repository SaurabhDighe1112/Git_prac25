/*
 * write a function to take int[] array as input and return true
 * if multiplication of any 2 numbers in array is greater than double the sum of all element in arrray
 * 
 * input:	{1,2,3,4,5};
 * output:	false
 * 
 * input:	{10,20,30,40};
 * output:	true
 * 
 * input:	{1,1,1,1};
 * output:	false
 * 
 * input:	{200,100,1,2};
 * output:	true
 */

package assignments;

import java.util.Arrays;

public class Assignment71 {
	boolean processData(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int multiplication = arr[arr.length-1]*arr[arr.length-2];
		int sum =0;
		for(int i=0; i<arr.length;i++) {
			sum+= arr[i];
		}
		if((sum*2)<multiplication)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		System.out.println(new Assignment71().processData(arr1));
		
		int[] arr2 = {10,20,30,40};
		System.out.println(new Assignment71().processData(arr2));
		
		int[] arr3 = {1,1,1,1};
		System.out.println(new Assignment71().processData(arr3));
		
		int[] arr4 = {200,100,1,2};
		System.out.println(new Assignment71().processData(arr4));
		
		int[] arr5 = {1,5,5,12,5};
		System.out.println(new Assignment71().processData(arr5));
	}
}
