/*
 * WAP to print patterns
 *	1.	1
 * 		2 2
 * 		3 3 3
 * 		4 4 4 4 
 */

package assignments.assignment68;

public class Assignment68_3 {
	void numPatternSameNum(int num) {
		for(int i=1; i<=num;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Assignment68_3().numPatternSameNum(4);
	}
}
