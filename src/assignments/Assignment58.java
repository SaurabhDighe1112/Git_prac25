/*
 * WAP to print all prime number from given array
 * input:{10,44,33,21,13,17,66};
 * 
 */

package assignments;

import java.util.Arrays;

public class Assignment58 {
	boolean isPrimeNumber(int x) {
		for(int i=2;i<x;i++) {
			if(x%i==0)
				return false;
		}
		return true;
	}

	int getPrimeNumCountInArray(int[] arr) {
		int count=0;
		for(int i=0; i<arr.length;i++) {
			if(isPrimeNumber(arr[i]))
				count++;
		}
		return count;
	}
	
	int[] getAllPrimeNumFromArray(int[] arr) {
		int[] primeNumArray = new int[getPrimeNumCountInArray(arr)];
		for(int i=0,j=0;i<arr.length;i++) {
			if(isPrimeNumber(arr[i])) {
				primeNumArray[j] = arr[i];
				j++;
			}
		}
		return primeNumArray;
	}
	
	public static void main(String[] args) {
		Assignment58 assignment58 = new Assignment58();
		int[] inputArr = {10,44,33,21,13,17,66};
		System.out.println(Arrays.toString(assignment58.getAllPrimeNumFromArray(inputArr)));
	}
}
