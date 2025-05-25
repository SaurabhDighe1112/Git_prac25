/*
 * Convert case of each character in given string
 * Special char & digits should be place in place
 * input: T1_eCHnoC
 */

package assignments;

public class Assignment30 {
	String convertCharCase(String str) {
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i)))
				str1+=Character.toLowerCase(str.charAt(i));
			else if(Character.isLowerCase(str.charAt(i)))
				str1+=Character.toUpperCase(str.charAt(i));
			else
				str1+=str.charAt(i);
		}
		return str1;
	}
	
	public static void main(String[] args) {
		Assignment30 assignment30 = new Assignment30();
		System.out.println(assignment30.convertCharCase("T1_eCHnoC"));
	}
}
