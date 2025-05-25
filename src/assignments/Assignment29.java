/*
 * String rearrangement
 * AllupperCase+AllDigits+AllLowercase+Specialcharacters
 * input: Te6ch!no_cr2edi3tS
 */
package assignments;

public class Assignment29 {
	String getUpperCase(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i)))
				str1+=str.charAt(i);
		}
		return str1;
	}
	
	String getLowerCase(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i)))
				str1+=str.charAt(i);
		}
		return str1;
	}
	
	String getDigits(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i)))
				str1+=str.charAt(i);
		}
		return str1;
	}
	
	String getSpecialChar(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i)))
				str1+=str.charAt(i);
		}
		return str1;
	}
	
	void processStringforRearrangement(String str) {
		System.out.println(getUpperCase(str)+getDigits(str)+getLowerCase(str)+getSpecialChar(str));
	}
	
	public static void main(String[] args) {
		Assignment29 assignment29 = new Assignment29();
		assignment29.processStringforRearrangement("Te6ch!no_cr2edi3tS");
	}
}