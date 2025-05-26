/*
 * String rearrangement
 * input: t1Chnoc2redi5TS
 * output: CTS8thnocredi;
 * (UpperCase+sumOfDigits+lowerCase)
 */

package assignments;

public class Assignment32 {
	String getUpperCaseLetters(String str) {
		String uCaseLetters="";
		for(int i=0; i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i)))
				uCaseLetters+=str.charAt(i);
		}
		return uCaseLetters;
	}
	
	String getLowerCaseLetters(String str) {
		String lCaseLetters="";
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i)))
				lCaseLetters+=str.charAt(i);
		}
		return lCaseLetters;
	}
	
	int getSumOfAllDigitsInString(String str) {
		int sum=0;
		String temp="";
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				temp=String.valueOf(str.charAt(i));
				for(int j=i+1;j<str.length();j++) {
					if(Character.isDigit(str.charAt(j)))
						temp+=str.charAt(j);
					else
						break;
				}
				sum+=Integer.parseInt(temp);
			}
		}
		return sum;
	}
	
	String processString(String str) {
		String str1="";
		str1+=getUpperCaseLetters(str);
		str1+=getSumOfAllDigitsInString(str);
		str1+=getLowerCaseLetters(str);
		return str1;
	}
	
	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();
		System.out.println(assignment32.processString("t1Chnoc2redi5TS"));
	}
}
