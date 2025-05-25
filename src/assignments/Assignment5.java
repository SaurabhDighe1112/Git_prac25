/*
Assignment - 5 : 22nd April'25
Create a class called BankDetail and print how many time debit, credit and printstatement method has been callE Instance variable can be balance = 1000, debitCount, creditCount, printStatementCount.
printCountInfo method should show how many times debit,credit and printStatement method has been called. 
from main method calling sequence should be as follows:
debitAmt() -> debitCount = debitCount+1, balance = balance - 200;
creditAmt()
creditAmt()
creditAmt()
printStatement() [this method should print remaining balance]
printCountInfo()
output :
remaining balance is 2000
debit method call count -> 1
credit method call count -> 3
printstatment method call count -> 1
Note : debitAmt deduct 200 rs, creditAmt increase balance by 400 rs
*/
package assignments;

class Assignment5{
	int balance= 1000,debitCount, creditCount, printStatementCount;
	
	void creditAmt(){
		balance+=400;
		creditCount++;
	}
	
	void debitAmt(){
		balance-=200;
		debitCount++;
	}
	
	void printStatement(){
		System.out.println("remaining balance is "+balance);
		printStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("debit method call count ->"+debitCount+
		"\ncredit method call count ->"+creditCount+
		"\nprintstatment method call count ->"+printStatementCount);
	}
	
	public static void main(String[] args){
		Assignment5 a = new Assignment5();
		a.debitAmt();
		a.creditAmt();
		a.creditAmt();
		a.creditAmt();
		a.printStatement();
		a.printCountInfo();
	}
}