/*
 * WAP to print the numbers with freq 2
 * input:
 * Integer[] arr = {10,23,45,66,10,10,23,66,66,77,77};
 */

package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment83 {
	void printNumberWithFreq(int freq, Integer[] arr) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		while(list.size()!=0) {
			Integer removed = list.get(0);
			int size = list.size();
			list.removeAll(Arrays.asList(removed));
			if((list.size()+2)==size)
				System.out.println(removed);
		}
	}
	
	public static void main(String[] args) {
		Integer[] arr = {10,23,45,66,10,10,23,66,66,77,77};
		new Assignment83().printNumberWithFreq(2, arr);
	}
}
