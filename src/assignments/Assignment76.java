/*
 * WAP to find number is Armstrong number or not
 * input:	153
 *			200
 * 			1634
 * 			1823
 * 			93084
 * 			92110
 */
package assignments;

public class Assignment76 {
	int countDigitsInNumber(int num) {
		int num1 = num, count=0;
		while(num1!=0) {
			num1 = num1/10;
			count++;
		}
		return count;
	}
	
	void isArmstrong(int num) {
		int num1 = num, sum = 0;
		
		while(num1!=0) {
			sum = (int) (sum + Math.pow((num1%10), countDigitsInNumber(num)));
			num1 = num1/10;
		}
		if(num==sum)
			System.out.println(num+" is ArmStrong Number.");
		else
			System.err.println(num+" is not ArmStrong Number.");
	}
	
	public static void main(String[] args) {
		Assignment76 assignment76 = new Assignment76();
		assignment76.isArmstrong(153);
		assignment76.isArmstrong(200);
		assignment76.isArmstrong(1634);
		assignment76.isArmstrong(1823);
		assignment76.isArmstrong(93084);
		assignment76.isArmstrong(92110);
	}
}
