/*
 * WAP to print below pattern
 * 		A
 * 		B C	
 * 		D E F 
 * 		G H I J
 */

package assignments.assignment69;

public class Assignment69_2 {
	void printPattern(int num) {
		char ch = 'A';
		for(int i=1; i<=num;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(ch++ +" ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Assignment69_2().printPattern(4);
	}
}
