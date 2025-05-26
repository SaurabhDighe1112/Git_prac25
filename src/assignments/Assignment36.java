/*
 * print count of digits, count of Uppercase, count of lowercase & count of special char from given string without using String class methods
 * input: Te2chn6o,cre-4di_T!s
 */

package assignments;

public class Assignment36 {
	void getStringDetails(String str) {
		int countD=0, countU=0, countL=0, countS=0;
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>=48 && ch<=57)
				countD++;
			else if(ch>=65 && ch<=90)
				countU++;
			else if(ch>=97 && ch<=122)
				countL++;
			else
				countS++;
		}
		
		System.out.println("UpperCase=>"+countU+"\nLowerCase=>"+countL+"\nDigits=>"+countD+"\nSpecialChar=>"+countS);
	}
	
	public static void main(String[] args) {
		Assignment36 assignment36 = new Assignment36();
		assignment36.getStringDetails("Te2chn6o,cre-4di_T!s");
	}
}