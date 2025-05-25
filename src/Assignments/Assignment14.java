/*
Assignment 14
WAP to print even number on user specified range 10 to 15
*/
package Assignments;

class Assignment14{
	void printEvenNumbers(int startRange, int endRange){
		System.out.println("Even numbers between "+startRange+" & "+endRange+" are:-");
		for(int index=startRange; index<=endRange;index++){
			if(index%2==0)
				System.out.println(index);
		}
	}
	
	public static void main(String[] args){
		Assignment14 a = new Assignment14();
		a.printEvenNumbers(10,15);
	}
}