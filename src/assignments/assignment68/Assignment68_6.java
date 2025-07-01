/*
 * WAP to print patterns
 * 1.	0
 * 		0 1
 * 		0 1 0
 * 		0 1 0 1
 */

package assignments.assignment68;

public class Assignment68_6 {
	void printbinaryPattern(int num) {
		for(int i=1; i<=num;i++) {
			for(int j=1; j<=i;j++) {
				if(j%2==0)
					System.out.print(1+" ");
				else
					System.out.print(0+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Assignment68_6().printbinaryPattern(4);
	}
}
