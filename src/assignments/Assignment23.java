/*
Return Count of digits from given string
input: "Te2chn6ocre4diTs Kan2a3n4i"
*/
package assignments;

public class Assignment23 {
	int getDigitCountInString(String str) {
		int count=0;
		for(int index=0; index<str.length();index++) {
			char ch= str.charAt(index);
			if(ch>=48 && ch<=57)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		System.out.println(assignment23.getDigitCountInString("Te2chn6ocre4diTs Kan2a3n4i"));
	}
}