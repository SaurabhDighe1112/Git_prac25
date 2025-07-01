/*
 * WAP to print patterns
 * 1.	1
 * 		1 2
 * 		1 2 3
 * 		1 2	3 4 
 */

package assignments.assignment68;

public class Assignment68_2 {
	void numPatternPrint(int num) {
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Assignment68_2().numPatternPrint(5);
	}
}
