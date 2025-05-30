/*
 * WAP to find the character frequency of 'a' in each word from the given String String str = "technocredits session examples having names starting with letter a"
 */

package assignments;

public class Assignment57 {
	int freqOfChar(String str, char ch) {
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(String.valueOf(ch).equals(String.valueOf(str.charAt(i))))
				count++;
		}
		return count;
	}
	void getCharFreqInArray(String str, char ch) {
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length;i++) {
			int count =freqOfChar(arr[i], ch);
			if(count>0)
				System.out.println("Frequench of char->'"+ch+"' in String-> \""+arr[i]+"\" is-> "+count);
		}
		return;
	}
	
	public static void main(String[] args) {
		Assignment57 assignment57 = new Assignment57();
		char ch = 'a';
		String str= "technocredits session examples having names starting with letter a";
		assignment57.getCharFreqInArray(str, ch);
	}
}
