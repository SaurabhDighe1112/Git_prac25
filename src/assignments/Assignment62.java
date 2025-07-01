/*WAP to find if given string is palindrome
	input:	techno
	output:	techno is not palindrome
	
	input:	nayan
	output: nayan is palindrome
*/
package assignments;

public class Assignment62 {
	// method with for loop to check palindrome
	boolean isPalindrome(String str) {
		if (str.length() < 2)
			return false;
		for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
			if (str.charAt(i) != str.charAt(j))
				return false;
		}
		return true;
	}

	void checkPalindrome(String str) {
		String str1 = str.toLowerCase();
		if (isPalindrome(str1))
			System.out.println(str + " is palindrome");
		else
			System.out.println(str + " is not palindrome");
	}

	// method with StringBuilder to reverse and compare 2 strings
	boolean isPalindrome1(String str) {
		if (str.length() < 2) {
			System.out.println(str + " is not palindrome");
			return false;
		}
		StringBuilder sb = new StringBuilder(str);
		String str1 = sb.reverse().toString();
		if (str.equalsIgnoreCase(str1)) {
			System.out.println(str + " is palindrome");
			return true;
		} else {
			System.out.println(str + " is not palindrome");
			return false;
		}

	}

	public static void main(String[] args) {
		Assignment62 assignment62 = new Assignment62();
		assignment62.checkPalindrome("techno");
		assignment62.checkPalindrome("nayan");
		assignment62.checkPalindrome("Nayan");
		assignment62.checkPalindrome("A");
		assignment62.checkPalindrome("Aa");

		System.out.println("Below output with StringBuilder reverse method approach");
		assignment62.isPalindrome1("techno");
		assignment62.isPalindrome1("nayan");
		assignment62.isPalindrome1("Nayan");
		assignment62.isPalindrome1("A");
		assignment62.isPalindrome1("Aa");
	}
}
