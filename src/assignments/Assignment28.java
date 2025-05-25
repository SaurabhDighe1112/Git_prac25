/*
 * Return reverse string of given String and print both strings in main method
 * input: techno
 * output: reverse of techno is onhcet.
 */
package assignments;

public class Assignment28 {
	String getReverseString(String str) {
		String revStr="";
		for(int j=str.length()-1; j>=0;j--) {
			revStr+= str.charAt(j);
		}
		return revStr;
	}
	
	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		String str="techno";
		System.out.println("Reverse of "+str+" is "+assignment28.getReverseString(str));
	}
}
