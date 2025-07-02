/*
 * WAP to find out freq of each number from given array
 * input: {15,44,13,12,15,44,44,44}
 * output:
 * 	15 -> 2
 * 	44 -> 4
 * 	13 -> 1
 * 	12 -> 1
 */

package assignments;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment89 {
	void getFreqofNumbersInArray(Integer[] arr) {
		Map<Integer, Integer> mapOfNumbers = new LinkedHashMap<Integer, Integer>();
		for(int i=0; i<arr.length;i++) {
			if(mapOfNumbers.containsKey(arr[i])) {
				mapOfNumbers.put(arr[i], mapOfNumbers.get(arr[i])+1);
			}else
				mapOfNumbers.put(arr[i], 1);
		}
		Set<Integer> setOfKeys = mapOfNumbers.keySet();
		for(int num : setOfKeys) {
			System.out.println(num+" -> "+mapOfNumbers.get(num));
		}
	}
	
	public static void main(String[] args) {
		Integer[] arr = {15,44,13,12,15,44,44,44};
		Assignment89 assignment89 = new Assignment89();
		assignment89.getFreqofNumbersInArray(arr);
	}
}
