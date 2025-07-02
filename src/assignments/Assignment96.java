/*
 * WAP which prints all the chars having highest freq
 * input: "aakankshakknnn"
 */

package assignments;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment96 {
	void printAllCharsWithMaxFreq(String str) {
		Map<Character, Integer> mapOfChar = new LinkedHashMap<Character, Integer>();
		for(int i=0; i<str.length();i++) {
			char ch =str.charAt(i);
			if(mapOfChar.containsKey(ch))
				mapOfChar.put(ch, mapOfChar.get(ch)+1);
			else
				mapOfChar.put(ch, 1);
		}
		Object[] valueSet = mapOfChar.values().toArray();
		Set<Character> keySets = mapOfChar.keySet();
		Arrays.sort(valueSet);
		int maxFreq = valueSet.length-1;
		for(char ch : keySets) {
			if(mapOfChar.get(ch)==maxFreq) {
				System.out.println(ch);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment96 assignment96 = new Assignment96();
		assignment96.printAllCharsWithMaxFreq("aakankshakknnn");
	}
}
