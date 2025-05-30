/*
 * WAP to get age difference between eldest and youngest family member.
 * Get count of family members and ages from user
 */

package assignments;
import java.util.Scanner;

public class Assignment52{
	int[] getInputArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many family members are there in your family?");
		int famCount = sc.nextInt();
		System.out.println("Input ages of family members with space seperator");
		int[] input = new int[famCount];
		for(int i=0;i<input.length;i++) {
			input[i] = sc.nextInt();
		}
		sc.close();
		return input;
	}
	
	String getAgeDiffBetweenYongestandEldest(int[] arr){
		int maxAge=0, minAge=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxAge) {
				maxAge=arr[i];
			}else if(arr[i]<minAge)
				minAge = arr[i];
		}
		return "Age difference between yongest and eldest member is "+(maxAge-minAge)+" years.";
	}
	
	public static void main(String[] args) {
		Assignment52 assignment52 = new Assignment52();
		int[] inputArr = assignment52.getInputArray();
		System.out.println(assignment52.getAgeDiffBetweenYongestandEldest(inputArr));
	}
}
