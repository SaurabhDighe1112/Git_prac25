/*
 * Return sum of all digits in given string
 * input: tech3no3cre4dit9s
 */
package assignments;

public class Assignment31 {
	int getSumOfAllDigits(String str) {
		int sum=0;
		String temp="";
		for(int i=0; i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				temp= String.valueOf(str.charAt(i));
				for(int j=i+1;j<str.length();j++) {
					if(Character.isDigit(str.charAt(j)))
						temp+=str.charAt(j);
					else 
						break;
				}
				sum+=Integer.parseInt(temp);
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();
		System.out.println(assignment31.getSumOfAllDigits("tech3no3cre4dit9s"));
	}
}