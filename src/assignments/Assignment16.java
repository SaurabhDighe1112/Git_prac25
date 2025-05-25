/*
Assignment16
WAP that accepts user defined range(10,50) and perform the following tasks
1. Print all numbers divisible by 7 within the range
2. Find and print the maximum number divisible by 7 within the range
3. Calculate and print the sum of all number divisible by 7 within the range
4. Calculate and print the average of numbers divisible by 7
*/
package assignments;

class Assignment16{
	int maxNum, sum, count;
	
	void numDivBy7(int startRange, int endRange){
		System.out.print("Numbers divisible by 7 are:");
		for(int index=startRange; index<=endRange;index++){
			if(index%7==0){
				count++;
				sum+=index;
				System.out.print(" "+index);
				maxNum = index;
			}
		}
		System.out.println();
	}
	
	void lastNumDivBy7(){
		System.out.println("Max number divisible by 7 in given range is "+maxNum);
	}
	
	void sumOfAllNumDivBy7(){
		System.out.println("Sum of all numbers divisible by 7: "+sum);
	}
	
	void avgOfAllNumDivBy7(){
		System.out.println("Avg of all numbers divisible by 7: "+((double)sum/count));
	}
	
	public static void main(String[] args){
		Assignment16 a = new Assignment16();
		a.numDivBy7(10,50);
		a.lastNumDivBy7();
		a.sumOfAllNumDivBy7();
		a.avgOfAllNumDivBy7();
	}
}