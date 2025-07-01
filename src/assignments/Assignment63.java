/*
 * WAP to get all the palindrome words from given string
 * input:	"This is Maulik i am a friend of nayan and naman and i see nitin is also my friend"
 */

package assignments;

public class Assignment63 {
	boolean isPalindrome(String str) {
		if(str.length()<2)
			return false;
		String str1 = str.toLowerCase();
		for(int i=0, j=str.length()-1; i<str.length()/2;i++,j--) {
			if(str1.charAt(i)!=str1.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
	void printPalindromeWords(String str) {
		String[] strArr = str.split(" ");
		for(String word : strArr) {
			if(isPalindrome(word)) {
				System.out.println(word);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment63 assignment63 = new Assignment63();
		String str = "This is Maulik i am a friend of nayan and naman and i see nitin is also my friend";
		assignment63.printPalindromeWords(str);
	}
}
