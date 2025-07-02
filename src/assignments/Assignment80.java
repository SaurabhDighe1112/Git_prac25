/*
 * WAP to print unique set of numbers from given Array
 * int[] input = {10,12,13,11,12,17,17,10,88,66,45};
 */

package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment80 {
	void printUniqueSetOfNumbersInArray(int[] arr) {
		List<Integer> listOfNonRepeatingNumbers = new ArrayList<Integer>();
		for(int num : arr) {
			if(!listOfNonRepeatingNumbers.contains(num))
				listOfNonRepeatingNumbers.add(num);
		}
		System.out.println(listOfNonRepeatingNumbers);
	}
		
	public static void main(String[] args) {
		int[] input = {10,12,13,11,12,17,17,10,88,66,45};
		new Assignment80().printUniqueSetOfNumbersInArray(input);
	}
}
