/*
 * print all the numbers from given array which are div by 3 or 5
 * input: {10, 30, 22, 45, 67, 98, 99}
 */

package assignments;

public class Assignment41 {
	void printNumDivBy3or5(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%3==0 || arr[i]%5==0)
				System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Assignment41 assignment41 = new Assignment41();
		int[] arr = {10, 30, 22, 45, 67, 98, 99};
		assignment41.printNumDivBy3or5(arr);
	}
}
