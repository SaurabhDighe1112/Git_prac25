/*
 * WAP to return sum of all numbers present in given input
 * input:	"i have 13 years and 6 months of experience and 2 years of experience as trainer";
 * output:	21 
 */

package assignments;

public class Assignment72 {
	int sumOfAllDigits(String str) {
		int sum =0;
		String output ="0";
		for(int i=0; i<str.length()-1;i++) {
			if(Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i+1))){
				output+=str.charAt(i);
			}else {
				sum += Integer.parseInt(output);
				output="0";
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(new Assignment72().sumOfAllDigits("i have 13 years and 6 months of experience and 2 years of experience as trainer"));
	}
}
