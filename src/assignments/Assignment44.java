/*
 * return the index of first positive number from array
 * input:{-55,-33,-22,45,-66,89};
 */

package assignments;

public class Assignment44 {
	
	int getPositiveNumIndex(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Assignment44 assignment44 = new Assignment44();
		int[] arr = {-55,-33,-22,45,-66,89};
		System.out.println(assignment44.getPositiveNumIndex(arr));
	}
}
