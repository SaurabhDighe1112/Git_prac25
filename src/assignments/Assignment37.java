/*
 *String rearrangement
 *input: Te6ch!no_cr2edi3tS
 *output: TS623echnocredit!_ 
 */

package assignments;

public class Assignment37 {
	String getUpperCaseLetters(String str) {
		String output="";
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(ch>=65 && ch<=90)
				output+=str.charAt(i);
		}
		return output;
	}
	
	String getLowerCaseLetters(String str) {
		String output="";
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(ch>=97 && ch<=122)
				output+=str.charAt(i);
		}
		return output;
	}
	
	String getDigits(String str) {
		String output="";
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(ch>=48 && ch<=57)
				output+=str.charAt(i);
		}
		return output;
	}
	
	String getSpecialChar(String str) {
		String output="";
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(!(ch>=48 && ch<=57) && !(ch>=65 && ch<=90) && !(ch>=97 && ch<=122))
				output+=str.charAt(i);
		}
		return output;
	}
	
	String getRearrangedString(String str) {
		String output=getUpperCaseLetters(str)+getDigits(str)+getLowerCaseLetters(str)+getSpecialChar(str);
		return output;
	}
	
	public static void main(String[] args) {
		Assignment37 assignment37 = new Assignment37();
		System.out.println(assignment37.getRearrangedString("Te6ch!no_cr2edi3tS"));
	}
}
