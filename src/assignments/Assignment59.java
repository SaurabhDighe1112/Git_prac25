/*
 * WAP to get digit count in array
 * input: {"tech1no","c1re2d4i5ts","t1ec3hn3oc3r4e5d5i5t8s9};
 */

package assignments;

public class Assignment59 {
	int digitCount;
	
	void getDigitCountInString(String str) {
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) 
				digitCount++;
		}
	}
	
	int getDigitCountInArray(String[] arr) {
		digitCount=0;
		for(int i=0;i<arr.length;i++) {
			getDigitCountInString(arr[i]);
		}
		return digitCount;
	}
	
	public static void main(String[] args) {
		Assignment59 assignment59 = new Assignment59();
		String[] inputArr = {"tech1no","c1re2d4i5ts","t1ec3hn3oc3r4e5d5i5t8s9"};
		System.out.println(assignment59.getDigitCountInArray(inputArr));
	}
}
