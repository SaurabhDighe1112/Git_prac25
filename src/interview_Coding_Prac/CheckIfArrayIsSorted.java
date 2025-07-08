/*
 * WAP to Check if given array to sorted or not
 * int[] arr = {10,15,16,21,22,20};
 * int[] arr = {10,15,16,21,22,26};
 * int[] arr = {26,22,21,16,15,10};
 */

package interview_Coding_Prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CheckIfArrayIsSorted {
	boolean isArraySorted(int[] arr) {
		for(int i=1; i<arr.length-1;i++) {
			if((!(arr[i-1]<arr[i] && arr[i]<arr[i+1]))) {
				return false;
			}
		}
		return true;
	}
	
	boolean isArrayReverseSorted(int[] arr) {
		for(int i=1; i<arr.length-1;i++) {
			if((!(arr[i-1]>arr[i] && arr[i]>arr[i+1]))) {
				return false;
			}
		}
		return true;
	}
	
	void checkArraySorting(int[] arr) {
		System.out.println(Arrays.toString(arr));
		if(isArraySorted(arr))
			System.out.println("Array is sorted");
		else {
			if(isArrayReverseSorted(arr))
				System.out.println("Array is sorted in Reverse Order");
			else
				System.out.println("Array is not sorted");
		}
	}
	
	void checkArraySorting(String[] arr) {
		System.out.println(Arrays.toString(arr));
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
		if(isArraySorted(arr))
			System.out.println("Array is sorted");
		else
			if(isArrayReverseSorted(al))
				System.out.println("Array is sorted in Reverse Order");
			else
				System.out.println("Array is not sorted");
	}
	
	boolean isArraySorted(String[] arr) {
		//List<Object> al1 = new ArrayList<Object>(al);
		String[] arr1 = new String[arr.length];
		for(int i=0; i<arr.length;i++) {
			arr1[i] = arr[i];
		}
		Arrays.sort(arr1);

		for(int i=0; i<arr.length;i++) {
			if(arr[i]!=arr1[i])
				return false;
		}
		return true;
	}
	
	boolean isArrayReverseSorted(ArrayList<String> al) {
		ArrayList<String> al1= al;
		Collections.reverse(al1);
		for(int i=0; i<al1.size();i++) {
			if(al.get(i)!=al1.get(i))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {10,15,16,21,22,23};
		CheckIfArrayIsSorted al = new CheckIfArrayIsSorted();
		al.checkArraySorting(arr1);	
		
		int[] arr2 = {10,18,16,21,22,23};
		al.checkArraySorting(arr2);	
		
		int[] arr3 = {25,20,16,10,2,0};
		al.checkArraySorting(arr3);
	}
}
