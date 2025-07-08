/*
 * WAP to reverse array without using new array
 */

package interview_Coding_Prac;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayWithoutNewArray {
	String reverseString(Object str) {
		//using StringBuilder reverse String
		//return new StringBuilder((String)str).reverse().toString();
		
		//using raw logic
		String output ="";
		String str1 = (String)str;
		for(int i = str1.length()-1; i>=0;i--) {
			output += str1.charAt(i);
		}
		return output;
	}
	
	
	//Without using collections fw and new Array
	void reverseArrWithoutNwArr(Object[] strArr) {
		for(int i=0, j=strArr.length-1; i<=strArr.length/2;i++, j--) {
			Object str = strArr[j];
			strArr[j] = strArr[i];
			strArr[i] = str;
			if(i==strArr.length/2) {
				strArr[i] = reverseString(strArr[i]);
			}
		}
		System.out.println(Arrays.toString(strArr));
	}
	
	//with collections fw and without new Array
	void reverseArrWithoutNwArr1(Object[] strArr) {
		List<Object> list =(Arrays.asList(strArr));
		Collections.reverse(list);
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		String [] str = {"Java-Selenium","technocredits","Pune","Maharashtra", "India"};
		//new ReverseArrayWithoutNewArray().reverseArrWithoutNwArr(str);
		new ReverseArrayWithoutNewArray().reverseArrWithoutNwArr1(str);
	}
}
