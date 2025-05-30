/*
 * WAP to find freq of char 'a' in String technocredits;
 */

package assignments;

import java.util.Scanner;

public class Assignment55 {
	int getFreqOfChar(String str, char ch) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			String c = String.valueOf(str.charAt(i));
			if(c.equals(String.valueOf(ch)))
				count++;
		}
		System.out.println("Count of Char-> '"+ch+"' in String-> \""+str+"\" is-> "+count);
		return count;
	}
	
	public static void main(String[] args) {
		Assignment55 assignment55 = new Assignment55();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String:");
		String str = sc.next();
		System.out.println("Input char:");
		char ch = sc.next().charAt(0);
		assignment55.getFreqOfChar(str,ch);
		sc.close();
	}
}
