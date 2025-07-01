/*
 * WAP to find duplicates from array. using ArrayList
 * int[] input ={10,12,17,12,19,22,10};
 */

package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Assignment79 {
	void findDuplicatesInArray(Integer[] arr) {
		String str="";
		List<Integer> listOfNumbers = new ArrayList<Integer>(Arrays.asList(arr));
		for(int num : listOfNumbers) {
			if(listOfNumbers.indexOf(num)!=listOfNumbers.lastIndexOf(num) && !str.contains(String.valueOf(num))) {
				System.out.println(num);
				str += String.valueOf(num);
			}
		}
	}
	
	public static void main(String[] args) {
		Integer[] input ={10,12,17,12,19,22,10,10,10};
		Assignment79 assignment79 = new Assignment79();
		assignment79.findDuplicatesInArray(input);
	}
}
