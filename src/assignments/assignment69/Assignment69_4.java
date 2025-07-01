/*
 * WAP to print below pattern
 * 		# $ # $
 * 		$ # $ #
 * 		# $ # $
 * 		$ # $ #
 */

package assignments.assignment69;

public class Assignment69_4 {
	void printPattern(int num) {
		for(int i=1; i<=num;i++) {
			for(int j=1; j<=num;j++) {
				if((i%2==0 && j%2!=0) || (i%2!=0 && j%2==0))
					System.out.print('$'+ " ");
				else
					System.out.print('#'+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Assignment69_4().printPattern(4);
	}
}
