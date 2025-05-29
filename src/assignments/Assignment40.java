/*
 * Print all the names from given array in reverse order
 * input: {"techno","technocredits","aaryahi"};
 */

package assignments;

public class Assignment40 {
	
	void printStringOfArrayInReverseOrder(String[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Assignment40 assignment40 = new Assignment40();
		String[] arr = {"techno","technocredits","aaryahi"};
		assignment40.printStringOfArrayInReverseOrder(arr);		
	}
}
