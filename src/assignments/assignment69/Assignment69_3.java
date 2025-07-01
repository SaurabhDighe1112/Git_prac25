/*
 * WAP to print below pattern
 * 		Aa
 * 		Aa Bb
 * 		Aa Bb Cc
 * 		Aa Bb Cc Dd
 */

package assignments.assignment69;

public class Assignment69_3 {
	void printPattern(int num) {
		for(int i=1; i<=num;i++) {
			char ch = 'A';
			for(int j=1; j<=i;j++) {
				System.out.print(ch + String.valueOf(Character.toLowerCase(ch)) + " ");
				ch++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Assignment69_3().printPattern(4);
	}
}
