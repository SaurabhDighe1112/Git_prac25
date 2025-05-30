/*
 * Write a program to check if the number is prime or not
 */
package assignments;

import java.util.Scanner;

public class Assignment48 {
	String isPrime(int num) {
		if(num>1) {
			for(int i=2;i<num;i++) {
				if(num%i==0)
					return num+" is not a Prime Number.";
			}
			return num+" is a Prime Number.";
		}else
			return num+" is not a Prime Number.";
	}
	
	public static void main(String[] args) {
		Assignment48 assignment48 = new Assignment48();
		
		System.out.println("Input the number you have to check:-");
		Scanner sc = new Scanner(System.in);
		System.out.println(assignment48.isPrime(sc.nextInt()));
		sc.close();
	}
}
