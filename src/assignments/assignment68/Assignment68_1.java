/*
 * WAP to print patterns
 * 1.	*
 * 		* *
 * 		* * *
 * 		* * * *
 */

package assignments.assignment68;

public class Assignment68_1 {
	void starPatternPrinting(int num) {
		for(int i=1; i<=num;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Assignment68_1().starPatternPrinting(5);
	}
}
