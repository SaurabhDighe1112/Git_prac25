/*
 * WAP to print patterns
 * 1.	1
 * 		2 3
 * 		4 5 6
 * 		7 8 9 10 
 */

package assignments.assignment68;

public class Assignment68_5 {
	void printNumSeqPattern(int num) {
		for(int i=1,k=1; i<=num;i++) {
			for(int j=1;j<=i;j++) { 
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Assignment68_5().printNumSeqPattern(4);
	}
}
