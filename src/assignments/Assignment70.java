/*
 * WAP to remove all leading zero and return remaining string
 * input:	000techno
 * output:	techno
 * 
 * input:	000tech0n00o
 * output:	tech0n00o
 * 
 * input:	000123101
 * output:	123101
 * 
 * input:	123123
 * output:	123123
 */

package assignments;

public class Assignment70 {
	int countLeadingZero(String str) {
		int count =0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)=='0')
				count++;
			else
				break;
		}
		return count;
	}
	
	String removeLeadingZeroFromString(String str) {
		String output="";
		int count = countLeadingZero(str);
		for(int i=count;i<str.length();i++) {
			output += str.charAt(i);				
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println(new Assignment70().removeLeadingZeroFromString("000techno"));
		System.out.println(new Assignment70().removeLeadingZeroFromString("000tech0n00o"));
		System.out.println(new Assignment70().removeLeadingZeroFromString("000123101"));
		System.out.println(new Assignment70().removeLeadingZeroFromString("123123"));
	}
}
