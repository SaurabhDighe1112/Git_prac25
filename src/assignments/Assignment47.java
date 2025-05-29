/*
 * WAP to return a union of 2 arrays and print in main method
 * input1: {10,12,3,4};
 * input2: {44,1,55};
 */

package assignments;
import java.util.Arrays;

public class Assignment47 {
	int[] getUnionOfArrays(int[] arr1, int[] arr2) {
		int len1 = arr1.length;
		int len2 = arr2.length;
		int[] unionArr = new int[len1+len2];
		for(int i=0, j=0; i<unionArr.length;i++) {
			if(i<len1)
				unionArr[i] = arr1[i];
			else if(i>=len1) {
				unionArr[i] = arr2[j];
				j++;
			}
		}
		
		return unionArr;
	}
	
	public static void main(String[] args) {
		Assignment47 assignment47 = new Assignment47();
		int[] arr1 = {10,12,3,4};
		int[] arr2 = {44,1,55};
		System.out.println(Arrays.toString(assignment47.getUnionOfArrays(arr1, arr2)));
	}
}
