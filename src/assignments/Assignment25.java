/*
 * return count of special character from given string
 * list of special characters can be found here
 * String spList=",;'_()*&^";
 * input: te!c,h(n[o
 * output: 2
 */
package assignments;

public class Assignment25 {
	int countSpecialCharInString(String str) {
		int count=0;
		String spList= ",;'_()*&^";
		for(int i=0; i<str.length();i++) {
			if(spList.contains(String.valueOf(str.charAt(i))))
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Assignment25 assignment25 = new Assignment25();
		System.out.println(assignment25.countSpecialCharInString("te!c,h(n[o"));
	}
}
