/*
 * return last index  of positive number from given array
 * input: {-55,-33,-22,45,-66,89,-90};
 */

package assignments;

public class Assignment45 {
	int getlastPositiveNumFromArr(int[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>0)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Assignment45 assignment45 = new Assignment45();
		int[] arr = {-55,-33,-22,45,-66,89,-90};
		System.out.println(assignment45.getlastPositiveNumFromArr(arr));
	}
}
