/*
 * WAP to check for palindrome string from give Array
 * String[] input= {"naman", "credits","kanani","aashvi","nayan","aaryahi","isha"};
 * output: 	naman
 * 			nayan
 */

package assignments;

public class Assignment77 {
	boolean isPalindrome(String str) {
		if(str.equalsIgnoreCase(new StringBuilder(str).reverse().toString()))
			return true;
		return false;
	}
	
	void isPalindrome(String[] arr) {
		for(String word : arr) {
			if(isPalindrome(word))
				System.out.println(word);
		}
	}
	
	public static void main(String[] args) {
		String[] input= {"Naman", "credits","kanani","aashvi","Nayan","aaryahi","isha"};
		Assignment77 assignment77 = new Assignment77();
		assignment77.isPalindrome(input);
	}
}
