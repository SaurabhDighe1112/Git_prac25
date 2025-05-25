/*
 * find how many words are there in String
 * input: Hi this is technocredits java selenium April25 batch
 */
package assignments;

public class Assignment27 {
	int getWordCountWithArray(String str) {
		str = str.replaceAll("\\s+", " ");
		String[] strArr= str.split(" ");
		return strArr.length;
	}
	
	int getWordCount(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') 
				count++;
		}
		return count+1;
	}
	
	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		System.out.println(assignment27.getWordCountWithArray("Hi this is      technocredits java selenium April25      batch"));
		System.out.println(assignment27.getWordCount("Hi this is      technocredits java selenium April25      batch"));
	}
}