/*
 * WAP to get maxNumber from given array using scanner class
 */

package assignments;
import java.util.Scanner;

public class Assignment50 {
	int[] getInputArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number you have to compare to get max number->");
		int num= sc.nextInt();
		int[] input = new int[num];
		System.out.println("Input numbers Array with space seperator->");
		for(int i=0;i<input.length;i++) {
			input[i]=sc.nextInt();
		}
		sc.close();
		return input;
	}
	
	int getMaxNumfromArray(int[] arr) {
		int maxNum=Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>maxNum)
				maxNum = arr[i];
		}
		return maxNum;
	}
	
	public static void main(String[] args) {
		Assignment50 assignment50 = new Assignment50();
		int[] inputArr = assignment50.getInputArray();
		System.out.println(assignment50.getMaxNumfromArray(inputArr));
	}
}
