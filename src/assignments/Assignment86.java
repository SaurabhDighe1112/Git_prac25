/*
 * WAP to find the unique element from given array by maintaining insertion order using HashSet
 * input[] arr ={10,44,33,12,44,55,66,12};
 */
package assignments;

import java.util.Set;
import java.util.LinkedHashSet;

public class Assignment86 {
	void printUniqueElementsArray(int[] arr) {
		Set<Integer> hs = new LinkedHashSet<Integer>();
		for(int num :arr) {
			hs.add(num);
		}
		System.out.println(hs);
	}
	
	public static void main(String[] args) {
		int[] arr ={10,44,33,12,44,55,66,12};
		new Assignment86().printUniqueElementsArray(arr);
	}
}
