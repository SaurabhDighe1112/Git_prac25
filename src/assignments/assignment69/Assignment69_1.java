/*
 * WAP to print below pattern
 * 		A
 * 		A B
 * 		A B C
 * 		A B C D
 */

package assignments.assignment69;

public class Assignment69_1 {
	void printPattern(int num) {
		for(int i=1; i<=num;i++) {
			char k = 'A';
			for(int j=1;j<=i;j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Assignment69_1().printPattern(4);
	}
}
