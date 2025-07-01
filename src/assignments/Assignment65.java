/*
 * WAP returning string with first and last letter interchanged
 * input:	"technocredits";
 * output:	sechnocreditt
 */

package assignments;

public class Assignment65 {
	String interchangeFirstandLastWord(String str) {
		String output =String.valueOf(str.charAt(str.length()-1));
		char ch = str.charAt(0);
		for(int i=1;i<str.length()-1;i++) {
			output +=str.charAt(i);
		}
		output+=ch;
		return output;
	}
	
	public static void main(String[] args) {
		Assignment65 assignment65 = new Assignment65();
		System.out.println(assignment65.interchangeFirstandLastWord("technocredits"));
	}
}
