/*
 * WAP to find freq of each character from given string
 * input: aakanksha
 * output:
 * a -> 4
 * k -> 2
 * n -> 1
 * s -> 1
 * h -> 1
 */

package assignments;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment88 {
	void getFreqOfEachCharInString(String str) {
		String word = str.toLowerCase();
		Map<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			if(hashMap.containsKey(word.charAt(i))) {
				hashMap.put(word.charAt(i), hashMap.get(word.charAt(i))+1);
			}else {
				hashMap.put(word.charAt(i), 1);
			}
		}
		Set<Character> setOfKeys = hashMap.keySet();
		for(char key : setOfKeys) {
			System.out.println(key+" -> "+hashMap.get(key));
		}
	}

	public static void main(String[] args) {
		String word = "Aakanksha";
		Assignment88 assignment88 = new Assignment88();
		assignment88.getFreqOfEachCharInString(word);
	}
}
