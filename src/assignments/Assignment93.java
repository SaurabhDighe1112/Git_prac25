/*
 * WAP to find how many char required to form given word
 * input: "aakanksha"
 */

package assignments;

import java.util.Set;
import java.util.TreeSet;

public class Assignment93 {
	void getCharCounttoFormWord(String str) {
		Set<Character> setOfWords = new TreeSet<Character>();
		for(int i=0;i<str.length();i++) {
			setOfWords.add(str.charAt(i));
		}
		System.out.println("Below set of characters required to form given word-> "+setOfWords);
	}
	
	public static void main(String[] args) {
		Assignment93 assignment93 = new Assignment93();
		assignment93.getCharCounttoFormWord("aakanksha");
	}
}
