/*
Assignment13
Write 2 methods to find bigger numbers from 2 numbers
and another to find smaller number from 2 numbers
*/
class Assignment13{
	int getBiggerNumber(int num1, int num2){
		if(num1>num2)
			return num1;
		else if(num2>num1)
			return num2;
		return 0;
	}
	
	int getSmallerNumber(int num1, int num2){
		if(num1<num2)
			return num1;
		else if(num2<num1)
			return num2;
		return 0;
	}
	
	void processData(int num1, int num2){
		if(getSmallerNumber(num1,num2)==0 || getBiggerNumber(num1, num2)==0){
			System.out.println("Both Numbers are same.");
		}else{
			System.out.println(getSmallerNumber(num1,num2)+" is smaller amongst "+num1+" & "+num2);
			System.out.println(getBiggerNumber(num1, num2)+" is Bigger amongst "+num1+" & "+num2);
		}
	}
	
	public static void main(String[] args){
		Assignment13 a = new Assignment13();
		int num1=10, num2=17;
		a.processData(num1,num2);
		System.out.println(a.getSmallerNumber(num1,num2)+" is smaller amongst "+num1+" & "+num2);
		System.out.println(a.getBiggerNumber(num1,num2)+" is Bigger amongst "+num1+" & "+num2);
		int num3=10;
		System.out.println(a.getSmallerNumber(num1,num3)+" is smaller amongst "+num1+" & "+num3);
		System.out.println(a.getBiggerNumber(num1,num3)+" is Bigger amongst "+num1+" & "+num3);
		
		a.processData(num1, num3);
	}
}