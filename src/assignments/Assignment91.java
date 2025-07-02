/*
 * WAP to find out duplicate numbers in array and its freq
 * Input: {15,44,13,12,15,44,44,44}
 * output: 	15 -> 2
 * 			44 -> 4
 */

package assignments;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment91 {
	void findDuplicatewithFreq(Integer[] input) {
		int count =0;
		Map<Integer,Integer> listOfNum = new LinkedHashMap<Integer, Integer>();
		for(int num : input) {
			if(listOfNum.containsKey(num)) {
				int value = listOfNum.get(num)+1;
				listOfNum.put(num, value);
			}else
				listOfNum.put(num, 1);
		}
		for(Integer num : input) {
			if(!listOfNum.remove(num, 1) && count<listOfNum.size()) {
				System.out.println(num+" -> "+listOfNum.get(num));
				count++;
			}
		}
	}
	
	public static void main(String[] args) {
		Integer[] arr = {15,44,13,12,15,44,44,44};
		Assignment91 assignment91 = new Assignment91();
		assignment91.findDuplicatewithFreq(arr);
	}
}
