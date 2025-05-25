/*
 * Return count of special Char from given String
 */

package assignments;

public class Assignment26 {
	int getSpecialCharCount(String str) {
		int count=0;
		for(int i=0; i<str.length();i++) {
			char ch =str.charAt(i);
			//if(!Character.isDigit(ch) && !Character.isLetter(ch))
			if(!(ch>=48 && ch<=58) && !(ch>=65 && ch<=90) && !(ch>=97 && ch<=122))
				count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		System.out.println(assignment26.getSpecialCharCount("te_chn oc!re[dit]s"));
	}
}
