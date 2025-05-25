/*
print count of digits, count of Uppercase, count of lowercase & count of special char
from given string
input: Te2chn6o,cre-4di_T!s
*/
package assignments;

public class Assignment24 {
	int getDigitCount(String str) {
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i)))//ASCII value of 0-9 -> 48 to 57
				count++;
		}
		return count;
	}
	
	int getUpperCaseCount(String str) {
		int count =0;
		for(int i=0; i<str.length();i++)
			if(Character.isUpperCase(str.charAt(i)))//ASCII value of A-Z -> 65 to 90
				count++;
		return count;
	}
	
	int getLowerCaseCount(String str) {
		int count=0;
		for(int i=0; i<str.length();i++)
			if(Character.isLowerCase(str.charAt(i)))//ASCII value of a-z -> 97 to 122
				count++;
		return count;
	}
	
	String processData(String str) {
		int countD = getDigitCount(str);
		int countU = getUpperCaseCount(str);
		int countL = getLowerCaseCount(str);
		int countSpecialChar= str.length()-countD-countU-countL;
		
		return "UpperCase->"+countU+"\nLowerCase->"+countL+"\nDigits->"+countD+"\nSpecialChar->"+countSpecialChar;
	}
	
	public static void main(String[] args) {
		Assignment24 assignment24 = new Assignment24();
		System.out.println(assignment24.processData("Te2chn6o,cre-4di_T!s"));
	}
}