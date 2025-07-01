/*
 * WAP to find duplicates from array. Do not use collections framework
 * int[] input ={10,12,17,12,19,22,10};
 */

package assignments;

public class Assignment78 {
	void findDuplicatesInArray(int[] arr) {
		String str="";
		for(int i=0; i<arr.length;i++) {
			int count=0;
			for(int j=0; j<arr.length;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(count>1 && !str.contains(String.valueOf(arr[i]))) {
				str=str+" "+String.valueOf(arr[i]);
				System.out.println(arr[i]);
			}
		}
	}
		
	public static void main(String[] args) {
		int[] input ={10,12,17,12,19,22,10};
		Assignment78 assignment78 = new Assignment78();
		assignment78.findDuplicatesInArray(input);
	}
}
