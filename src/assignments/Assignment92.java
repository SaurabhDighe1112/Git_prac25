/*
 * WAP to print unique chars from given String
 * input: aakanksha
 */

package assignments;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Assignment92 {
	void getUniqueChars(String str) {
		char[] strArr = str.toCharArray();
		for(char ch : strArr) {
			if(str.indexOf(ch)==str.lastIndexOf(ch))
				System.out.println(ch);
		}
	}
	
	void getUniqueCharsByCollectionsSet(String str) {
		Set<Character> listOfUniqueChar = new LinkedHashSet<Character>();
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(!listOfUniqueChar.contains(ch))
				listOfUniqueChar.add(ch);
			else
				listOfUniqueChar.removeAll(Arrays.asList(ch));
		}
		System.out.println(listOfUniqueChar);
	}
	
	void getUniqueCharsByCollectionsMap(String str) {
		Map<Character, Integer> listOfChar = new LinkedHashMap<Character, Integer>();
		for(int i=0; i<str.length();i++) {
			char ch =str.charAt(i);
			if(listOfChar.containsKey(ch))
				listOfChar.remove(ch);
			else
				listOfChar.put(ch, 1);
		}
		System.out.println(listOfChar);
	}
	
	public static void main(String[] args) {
		Assignment92 assignment92 = new Assignment92();
		assignment92.getUniqueChars("aakanksha");
		assignment92.getUniqueCharsByCollectionsSet("aakanksha");
		assignment92.getUniqueCharsByCollectionsMap("aakanksha");
	}
}
