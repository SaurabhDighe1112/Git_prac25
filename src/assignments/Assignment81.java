/*
 * WAP to print numbers which have only one frequency from given Array
 * int[] input = {10,12,13,11,12,17,17,10,88,66,45};
 */
package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment81 {
	void list(Integer[] arr) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		for(int i=0;i<arr.length;i++) {
			if(list.indexOf(arr[i])!=list.lastIndexOf(arr[i]))
				list.removeAll(Arrays.asList(arr[i]));
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		Integer[] input = {10,12,13,11,12,17,17,10,88,66,45};
		new Assignment81().list(input);
	}
}
