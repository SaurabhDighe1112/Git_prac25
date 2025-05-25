/*
Assignment19
Objective:Create a Java program that defines separate methods to handle each of the following tasks related to numbers
Instructions:
* The program should accept a start and end range from the user.
* Each requirement should be implemented in a separate method.
* Each method must:
	Return the result
	Also print the result in a proper and readable format in main method
	Use appropriate method names.
	
Functional Requirements (Each as a separate method):
1. First Divisible Number Create a method that returns and prints the first number divisible by 7 in the given range.
2. Second Divisible Number Create a method to find and print the second number divisible by 7 in the range.
3. Nth Divisible Number
	Accept a number n from the user and return the nth number divisible by 7 in the range. Print a message like: Range 1 to 100: 4th divisible by 7 in the range is: 28
4. Last Divisible Number Create a method to return the last number divisible by 7 in the range.
5. Second Last Divisible Number Return and print the second last number divisible by 7 in the range.
6. Nth Last Divisible Number Accept a number n from the user and return the nth last number divisible by 7 from the range. Example output: 
3rd last divisible by 7 in the range is: 35
*/
package assignments;

class Assignment19{
	int numDivBy7(int startRange, int endRange, int i){
		if(startRange<endRange){
			int count1=0;
			for(int index=startRange;index<=endRange;index++){
				if(index%7==0){
					count1++;
					if(count1==i)
						return index;
				}
			}
			return 0;
		}else{
			int count2=0;
			for(int index=startRange; index>=endRange; index--){
				if(index%7==0){
					count2++;
					if(count2==i)
						return index;
				}
			}
			return 0;
		}
	}
	
	int firstNumDivBy7(int startRange, int endRange){
		int num = numDivBy7(startRange, endRange, 1);
		System.out.println("first number divisible by 7 in the given range is "+num);
		return num;
	}
	
	int secondNumDivBy7(int startRange, int endRange){
		int num = numDivBy7(startRange, endRange, 2);
		System.out.println("Second number divisible by 7 in the given range is "+num);
		return num;
	}
	
	int nThDivNumBy7(int startRange, int endRange, int nthNum){
		int num = numDivBy7(startRange, endRange, nthNum);
		System.out.println(nthNum+" number divisible by 7 in the given range is "+num);
		return num;
	}
	
	int lastDivNumBy7(int startRange, int endRange){
		int num = numDivBy7(endRange, startRange, 1);
		System.out.println("last number divisible by 7 in the given range is "+num);
		return num;
	}
	
	int secondLastNumDivBy7(int startRange, int endRange){
		int num = numDivBy7(endRange, startRange, 2);
		System.out.println("Secont last number divisible by 7 in the given range is "+num);
		return num;
	}
	
	int nThLastNumDivBy7(int startRange, int endRange, int nthNum){
		int num = numDivBy7(endRange, startRange, nthNum);
		System.out.println(nthNum+" Last number divisible by 7 in the given range is "+num);
		return num;
	}
	
	public static void main(String[] args){
		Assignment19 a = new Assignment19();
		a.firstNumDivBy7(1,100);
		a.secondNumDivBy7(1,100);
		a.nThDivNumBy7(1,100,12);
		a.lastDivNumBy7(1,100);
		a.secondLastNumDivBy7(1,100);
		a.nThLastNumDivBy7(1,100,3);
	}
}