/*
 * Print all names from given array
 * input: {"techno","technocredits","aayahi"};
 */

package assignments;

public class Assignment39 {
	
	void printAllStringsfromArray(String[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Assignment39 assignment39 = new Assignment39();
		String[] arr = {"techno","technocredits","aayahi"};
		assignment39.printAllStringsfromArray(arr);
	}
}
