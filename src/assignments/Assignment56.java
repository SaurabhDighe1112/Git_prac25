/*
 * WAP to find freq of char 'a' in given Array
 * input:{"techno","credits","aakanksha","anmol","aaryahi"};
 */

package assignments;

public class Assignment56 {
	int freqOfChar(String str, char ch) {
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(String.valueOf(ch).equals(String.valueOf(str.charAt(i))))
				count++;
		}
		return count;
	}
	void getCharFreqInArray(String[] arr, char ch) {
		for(int i=0; i<arr.length;i++) {
			int count =freqOfChar(arr[i], ch);
			if(count>0)
				System.out.println("Frequench of char->'"+ch+"' in String-> \""+arr[i]+"\" is-> "+count);
		}
		return;
	}
	
	public static void main(String[] args) {
		Assignment56 assignment56 = new Assignment56();
		char ch = 'a';
		String[] inputArr= {"techno","credits","aakanksha","anmol","aaryahi"};
		assignment56.getCharFreqInArray(inputArr, ch);
	}
}
