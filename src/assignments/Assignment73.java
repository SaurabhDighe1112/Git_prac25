/*
 * WAP to print first 3 numbers from user
 * Valid numbers are the one which are non-zero and positive
 * 
 * input:	Maulik 10 20Krishna 3$0 30 40
 * 
 * output:	Valid numbers are 10,30,40
 */

package assignments;
import java.util.Scanner;

public class Assignment73 {
	void getValidInputsFromUser() {
		Scanner sc = new Scanner(System.in);
//		String s ="";
		String output ="";
		System.out.println("Please input all values seperated by space :");
//		while(!s.equalsIgnoreCase("N")) {
//			System.out.println("Please input first value:");
//			output = output+ sc.next()+" ";
//			
//			System.out.println("Do you want to continue assining values?(Y/N)");
//			s = sc.next();
//		}
		output = sc.nextLine();
		System.out.println(output);
		String[] strArr = output.split(" ");
		System.out.print("Valid numbers are ");
		for(int i=0 ,count=0; i<strArr.length;i++) {
			try {
				if(count<3) {
					int num = Integer.parseInt(strArr[i]);
					if(count>=1)
						System.out.print(",");
					System.out.print(num);
					count++;
				}else
					break;
			}catch (NumberFormatException e) {
				continue;
			}
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		Assignment73 assignment73 = new Assignment73();
		assignment73.getValidInputsFromUser();
	}
}
