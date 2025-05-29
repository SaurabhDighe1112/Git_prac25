/*
 * Return sum of all positive numbers
 * input:{-10,-44,55,-66,5};
 */

package assignments;

public class Assignment42 {
	void getSumOfAllPositiveNum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				sum+=arr[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Assignment42 assignment42 = new Assignment42();
		int[] arr = {-10,-44,55,-66,5};
		assignment42.getSumOfAllPositiveNum(arr);
	}
}
