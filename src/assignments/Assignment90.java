/*
 * WAP to find freq of word in given String
 * String input = "Hi Hello Hi Hi Pune Pune India India India";
 */

package assignments;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment90 {
	void getFreqOfWordsInString(String str) {
		String[] strArr = str.split(" ");
		Map<String, Integer> listOfWords = new LinkedHashMap<String, Integer>();
		for(String word : strArr) {
			if(listOfWords.containsKey(word))
				listOfWords.put(word, listOfWords.get(word)+1);
			else
				listOfWords.put(word, 1);
		}
		Set<String> setOfStrings = listOfWords.keySet();
		for(String word : setOfStrings) {
			System.out.println(word+" -> "+listOfWords.get(word));
		}
	}
	
	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Pune Pune India India India";
		Assignment90 assignment90 = new Assignment90();
		assignment90.getFreqOfWordsInString(str);
	}
}
