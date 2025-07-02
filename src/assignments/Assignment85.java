/*
 * WAP to find the duplicate elements from given array using HashSet
 * input[] arr ={10,44,33,12,44,55,66,12};
 */

package assignments;

import java.util.HashSet;
import java.util.Set;

public class Assignment85 {
	void findDuplicateElement(int[] arr) {
		Set<Integer> hs = new HashSet<Integer>();
		Set<Integer> duplicates = new HashSet<Integer>();
		for(int num : arr) {
			if(!hs.add(num))
				duplicates.add(num);
		}
		System.out.println(duplicates);
	}
	
	public static void main(String[] args) {
		int[] arr ={10,44,33,12,44,55,66,12};
		new Assignment85().findDuplicateElement(arr);
	}
}
