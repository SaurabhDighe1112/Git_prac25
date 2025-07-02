/*
 * WAP to find max freq char from string
 * input: "aakanksha"
 */

package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment94 {
	void maxFreqCharUsingCollectionsMap(String str) {
		Map<Character, Integer> listOfChar = new HashMap<Character, Integer>();
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(listOfChar.containsKey(ch))
				listOfChar.put(ch, listOfChar.get(ch)+1);
			else
				listOfChar.put(ch, 1);
		}
		int max=0;
		char maxCh =' ';
		for(int i=0; i<str.length();i++) {
			int value = listOfChar.get(str.charAt(i));
			if(value>max) {
				max=value;
				maxCh=str.charAt(i);
			}
		}
		System.out.print("Max freq char in given String is \""+maxCh+"\" with freq->"+max);
	}
	
	public static void main(String[] args) {
		Assignment94 assignment94 = new Assignment94();
		assignment94.maxFreqCharUsingCollectionsMap("aakanksha");
	}
}
