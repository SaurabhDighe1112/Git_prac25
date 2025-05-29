/*
 * return the difference between sum of odd number and even numbers
 * input: {4,6,12,17,13};
 */

package assignments;

public class Assignment43 {
	
	int getSumDiff(int[] arr) {
		int evenSum=0,oddSum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				evenSum+=arr[i];
			else
				oddSum+=arr[i];
		}
		return oddSum-evenSum;
	}

	public static void main(String[] args) {
		Assignment43 assignment43 = new Assignment43();
		int[] arr =  {4,6,12,17,13};
		System.out.println(assignment43.getSumDiff(arr));
	}
}
