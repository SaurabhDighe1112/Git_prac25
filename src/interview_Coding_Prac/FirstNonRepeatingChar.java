/*Find first non repeating character from given String
* with and without collections framework
* String str1 = "aakanksha"
* String str2 = "technocredits"
*/
package interview_Coding_Prac;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingChar {
	char firstNonRepeatingChar1(String str) {
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(str.indexOf(ch)==str.lastIndexOf(ch))
				return ch;
		}
		return '\u0000';
	}
	
	char firstNonRepeatingChar2(String str) {
		char[] chArr = str.toCharArray();
		Map<Character,Integer> charList = new LinkedHashMap<Character, Integer>();
		for(char ch :chArr) {
			if(charList.containsKey(ch))
				charList.put(ch, charList.get(ch)+1);
			else
				charList.put(ch, 1);
		}
		Set<Character> setofkeys = charList.keySet();
		for(char ch : setofkeys) {
			if(charList.get(ch)==1)
				return ch;
		}
		return '\u0000';
	}
	
	public static void main(String[] args) {
		FirstNonRepeatingChar fr = new FirstNonRepeatingChar();
		System.out.println("First Non Repeating character from string without colections framework:-");
		System.out.println(fr.firstNonRepeatingChar1("aakanksha"));
		System.out.println(fr.firstNonRepeatingChar1("technocredits"));
		//to print blank line between outputs
		System.out.println();
		System.out.println("First Non Repeating character from string with colections framework:-");
		System.out.println(fr.firstNonRepeatingChar2("aakanksha"));
		System.out.println(fr.firstNonRepeatingChar2("technocredits"));
	}
}
