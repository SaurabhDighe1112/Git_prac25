/*
 * WAP to check if given string is Anagram or not
 * input1:	listen
 * input2:	silent
 * 
 * input3:	aabbcc
 * input4:	abcabc
 */

package assignments;

import java.util.Arrays;

public class Assignment66 {
	//with sorting
	boolean isAnagram(String str1, String str2) {
		if(str1.length()!=str2.length())
			return false;
		char[] str1Arr = str1.toCharArray();
		char[] str2Arr = str2.toCharArray();
		
		Arrays.sort(str1Arr);
		Arrays.sort(str2Arr);
		
		for(int i=0; i<str1Arr.length;i++) {
			if(str1Arr[i]!=str2Arr[i])
				return false;
		}
		
		return true;
	}
	
	//without sorting
	boolean isAnagram1(String str1, String str2) {
		if(str1.length()!=str2.length())
			return false;
		
		String check1 = str1;
		String check2 = str2;
		while(check2.length()!=0) {
			char ch = check2.charAt(0);
			check1 = check1.replaceAll(String.valueOf(ch), "");
			check2 = check2.replaceAll(String.valueOf(ch), "");
			if(check1.length()!=check2.length())
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Assignment66 assignment66 = new Assignment66();
		System.out.println(assignment66.isAnagram("listen", "silent"));
		System.out.println(assignment66.isAnagram1("listens", "silents"));
		
		System.out.println(assignment66.isAnagram("aabbcc", "abcabc"));
		System.out.println(assignment66.isAnagram1("aabbcc", "abcabc"));
	}
}
