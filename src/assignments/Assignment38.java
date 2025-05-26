/*
 * Convert case of each character from given string using ASCII value
 * Digit & special char should be placed at same position
 * input: T1_eCHnoC
 * output: t1_EchNOc
 */
package assignments;

public class Assignment38 {
	String changeCharCase(String str) {
		String output="";
		for(int i=0; i<str.length();i++) {
			char ch= str.charAt(i);
			if(ch>=65 && ch<=90) {
				char ch1 =(char)(ch+32);
				output+=ch1;
			}else if(ch>=97 && ch<=122) {
				char ch1 =(char)(ch-32);
				output+=ch1;
			}else
				output+=ch;
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment38 assignment38 = new Assignment38();
		System.out.println(assignment38.changeCharCase("T1_eCHnoC"));
	}
}
