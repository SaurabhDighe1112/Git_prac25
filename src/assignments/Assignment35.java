/*
 * Swap values of 2 variables without using 3rd variable
 * input: x=10,y=20
 * output x=20, y=10
 */
package assignments;

public class Assignment35 {
	void get2NumberSwapped(int x, int y) {
		x+=y;//30
		y = x-y;//10
		x-=y;
		System.out.println("Num1=> "+x+"\nNum2=> "+y);
	}
	
	void get2StringSwapped(String str1, String str2) {
		int len1 = str1.length();
		str1= str1+str2;
		str2="";
		//below code to add str1 to str2
		for(int i=0; i<len1;i++) {
			str2+=str1.charAt(i);
		}
		
		//below code to swap str1 value by str2 value
		//str1=str1.substring(len1);		//Solution1
		str1 = str1.replace(str2, "");		//Solution2
		System.out.println("Str1 => "+str1+"\nStr2 => "+str2);
	}
	
	public static void main(String[] args) {
		Assignment35 assignment35 = new Assignment35();
		int num1=10, num2=20;
		String str1="Saurabh", str2="Dighe";
		System.out.println("Num1 is "+num1+"\nNum2 is "+num2);
		assignment35.get2NumberSwapped(num1, num2);
		System.out.println("Str1 is "+str1+"\nStr2 is "+str2);
		assignment35.get2StringSwapped(str1, str2);
	}
	
}
