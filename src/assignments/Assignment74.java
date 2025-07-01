/*
 * WAP to find reverse number without using string class methods
 * input:	123
 * output:	321
 */

package assignments;

import java.util.Scanner;

public class Assignment74 {
	int reverseNumberWithoutStringClassMethods(int number) {
		int input = number;
		int output = 0;
		while(input!=0) {
			int num1 = input%10;
			input = input/10;
			output= (output*10)+ num1;			
		}
		return output;
	}
	
	public static void main(String[] args) {
		System.out.println("Input number to reverse:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("input number is "+num+ ", reversed number of input is -> "+new Assignment74().reverseNumberWithoutStringClassMethods(num));
		scanner.close();
	}
}
