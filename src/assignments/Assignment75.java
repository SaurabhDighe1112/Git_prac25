/*WAP to check if number is palindrome without using string class methods
input: 121
output:	121 is palindrome

input:	123
output:	123 is not palindrome
*/
package assignments;

public class Assignment75 {
	void isPalindrome(int num) {
		int input= num;
		int output =0;
		while(input!=0) {
			output = (output*10)+input%10;
			input = input/10;
		}
		if(num==output)
			System.out.println(num+" is palindrome");
		else
			System.out.println(num+" is not palindrome");
	}
	
	public static void main(String[] args) {
		Assignment75 assignment75 = new Assignment75();
		assignment75.isPalindrome(121);
		assignment75.isPalindrome(122);
		assignment75.isPalindrome(221);
		assignment75.isPalindrome(211112);
	}
}
