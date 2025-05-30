/*
 * WAP to add n number provided by user
 */

package assignments;
import java.util.Scanner;

public class Assignment49 {
	int[] inputNumbers(int num) {
		int[] input = new int[num];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<input.length;i++) {
			System.out.println("Enter Number "+(i+1)+" to be added->");
			input[i]=sc.nextInt();
		}
		sc.close();
		return input;
	}

	int addNumbers(int[] intArr) {
		int sum=0;
		for(int i=0;i<intArr.length;i++) {
			sum+=intArr[i];
		}	
		return sum;
	}
	
	public static void main(String[] args) {
		Assignment49 assignment49 = new Assignment49();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you have to add-");
		int num = sc.nextInt();
		int sum = assignment49.addNumbers(assignment49.inputNumbers(num));
		sc.close();
		System.out.println("addition of numbers is->"+sum);
	}
}
