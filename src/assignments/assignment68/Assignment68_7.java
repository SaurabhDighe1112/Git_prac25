/*
 * WAP to print patterns
 * 1.	0
 * 		1 0
 * 		0 1 0
 * 		1 0 1 0 
 */

package assignments.assignment68;

public class Assignment68_7 {
	void printPattern(int num) {
		for(int i=1; i<=num;i++) {
			for(int j=1; j<=i;j++) {
				if((i%2==0 && j%2!=0) ||(i%2!=0 && j%2==0))
					System.out.print(1+" ");
				else
					System.out.print(0+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Assignment68_7().printPattern(4);
	}
}
