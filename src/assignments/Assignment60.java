/*
 * WAP to print count of digits in each string from given Array
 * input: {"tech1no","c1re2d4i5ts","t1ec3hn3oc3r4e5d5i5t8s9"};
 * output: 	tech1no->1
 * 			c1re2d4i5ts->4
 * 			t1ec3hn3oc3r4e5d5i5t8s9->10
 */

package assignments;

public class Assignment60 {
	int getCountOfDigitInString(String str) {
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(Character.isDigit(str.charAt(i)))
				count++;
		}
		return count;
	}
	
	void printAllDigitsCountOnEachIndex(String[] arr) {
		for(int i=0; i<arr.length;i++) {
			int digitCount = getCountOfDigitInString(arr[i]);
			System.out.println(arr[i]+"->"+digitCount);
		}
	}
	
	public static void main(String[] args) {
		Assignment60 assignment60 = new Assignment60();
		String[] inputArr = {"tech1no","c1re2d4i5ts","t1ec3hn3oc3r4e5d5i5t8s9"};
		assignment60.printAllDigitsCountOnEachIndex(inputArr);
	}
}
