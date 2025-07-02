/*
 * WAP to find the unique element from given array using HashSet
 * input[] arr ={10,44,33,12,44,55,66,12};
 */

package assignments;

import java.util.Set;
import java.util.HashSet;

public class Assignment84 {
	void printUniqueElements(int[] arr) {
		Set<Integer> hashset = new HashSet<Integer>();
		for(int num : arr) {
			if(!hashset.add(num))
				hashset.remove(num);
		}
		System.out.println(hashset);
	}
	
	public static void main(String[] args) {
		int[] arr ={10,44,33,12,44,55,66,12};
		new Assignment84().printUniqueElements(arr);
	}
}
