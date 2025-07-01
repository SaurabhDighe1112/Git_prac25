/*
 * WAP to find longest palindrome string from given input
 * input:	"naman hello hi techhcet technocredits nitin world"
 * output:	techhcet
 */

package assignments;

public class Assignment67 {
	boolean isPalindrome(String str) {
		for(int i=0, j=str.length()-1; i<str.length()/2;i++,j--) {
			if(str.charAt(i)!=str.charAt(j))
				return false;
		}
		return true;
	}
	
	String getLongestPalindrome(String str) {
		String[] strArr = str.split(" ");
		String output ="";
		
		for(String word : strArr) {
			if(isPalindrome(word) && word.length()>output.length()) {
				output = word;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment67 assignment67 = new Assignment67();
		String str ="naman hello hi techhcet technocredits creditsstiderc nitin world";
		System.out.println(assignment67.getLongestPalindrome(str));
	}
}
