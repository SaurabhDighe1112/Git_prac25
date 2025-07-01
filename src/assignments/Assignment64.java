/*
 * WAP to return an Array having only first uppercase letter from each word
 * input:	{"teCh2n4o","c1red1iTs","hEllo","7H6i666","hello"};
 * output:	[C,T,E,-]
 */

package assignments;

import java.util.Arrays;

public class Assignment64 {
	char getFirstUpperCaseLetter(String str) {
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch))
				return ch;
		}
		
		return '-';
	}
	
	char[] getUpperCaseCharArray(String[] strArr) {
		char[] charArr = new char[strArr.length];
		for(int i =0; i<strArr.length;i++) {
			charArr[i]=getFirstUpperCaseLetter(strArr[i]);
		}
		return charArr;
	}
	
	public static void main(String[] args) {
		Assignment64 assignment64 = new Assignment64();
		String[] arr = {"teCh2n4O","c1red1iTs","hELlo","7H6I666","hello"};
		System.out.println(Arrays.toString(assignment64.getUpperCaseCharArray(arr)));
	}
}
