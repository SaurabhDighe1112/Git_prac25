/*
 * WAP to get minimum Number from given array using scanner class
 */

package assignments;
import java.util.Scanner;

public class Assignment51 {
	int[] getInputArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many number to compare->");
		int num = sc.nextInt();
		int[] input = new int[num];
		System.out.println("Input all numbers to get minimun Number from with space seperator->");
		for(int i=0;i<input.length;i++) {
			input[i] = sc.nextInt();
		}
		sc.close();
		return input;
	}
	
	int getMinNumberFromArray(int[] arr) {
		int minNum= 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minNum)
				minNum = arr[i];
		}
		return minNum;
	}
	
	public static void main(String[] args) {
		Assignment51 assignment51 = new Assignment51();
		int[] inputArr = assignment51.getInputArray();
		System.out.println(assignment51.getMinNumberFromArray(inputArr));
	}
}
