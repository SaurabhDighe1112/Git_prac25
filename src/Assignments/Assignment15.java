/*
Assignment15
in the given range 5 to 40 print all number which are divisible by 5 & 3.
Output: Numbers divisible by 5 & 3 are:
15
30
*/
class Assignment15{
	void getNumbersDivBy5and3(int startRange, int endRange){
		System.out.println("Numbers divisible by 5 & 3 are:");
		
		for(int i=startRange;i<=endRange;i++){
			if(i%3==0 && i%5==0)
				System.out.println(i);
		}
	}
	
	public static void main(String[] args){
		Assignment15 a = new Assignment15();
		a.getNumbersDivBy5and3(5,40);
	}
}