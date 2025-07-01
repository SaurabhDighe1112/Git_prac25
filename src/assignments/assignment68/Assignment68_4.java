/*
 * WAP to print patterns
 * 1. 	1 2 3 4
 * 		1 2 3
 * 		1 2
 * 		1 
 */

package assignments.assignment68;

public class Assignment68_4 {
	void reverseNumPattern(int num) {
		for(int i=num; i>0;i--) {
			for(int j=1; j<=i;j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Assignment68_4().reverseNumPattern(4);
	}
}
