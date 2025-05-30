/*
 * Print all the names and there length from given array in reverse order
 * input: {"techno","technocredits","aaryahi"}; 
 */

package assignments;

public class Assignment46 {
	int getlength(String str) {
		return str.length();
	}
	
	void getAllNamesandLengthFromArray(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"->"+getlength(arr[i]));
		}
	}

	public static void main(String[] args) {
		Assignment46 assignment46 = new Assignment46();
		String[] arr = {"techno","technocredits","aaryahi"};
		assignment46.getAllNamesandLengthFromArray(arr);
	}
}
