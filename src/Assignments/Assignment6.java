/*
Assignment - 6 : 22nd April'25
Create a call called BankDetail and print how many time debit, credit and printstatement method has been called

Instance variable can be debitCount, creditCount, printStatementCount.
Static variable can be totalDebitCount, totalCreditCount, totalPrintStatementCount.

printCountInfo method should show how many times debit,credit and printStatement method has been called. printAllCountInfo method should show how many times total debit,credit and printStatement method has been callE

from main method create 2 objects and call debitAmt, creditAmt and printStatement multiple times.
output :
debit method call count -> 1
credit method call count -> 3
printstatment method call count -> 1

debit method call count -> 0
credit method call count -> 1
printstatment method call count -> 3

total debit Operations -> 1
total credit Operations -> 4
total printstatement Operations -> 4

*/
class Assignment6{
	int balance= 1000,debitCount, creditCount, printStatementCount;
	
	static int totalDebitCount, totalCreditCount, totalPrintStatementCount;
	
	void creditAmt(){
		balance+=400;
		creditCount++;
		totalCreditCount++;
	}
	
	void debitAmt(){
		balance-=200;
		debitCount++;
		totalDebitCount++;
	}
	
	void printStatement(){
		System.out.println("remaining balance is "+balance);
		printStatementCount++;
		totalPrintStatementCount++;
	}
	
	void printCountInfo(){
		System.out.println("debit method call count ->"+debitCount+
		"\ncredit method call count ->"+creditCount+
		"\nprintstatment method call count ->"+printStatementCount);
	}
	
	public static void main(String[] args){
		Assignment6 a1 = new Assignment6();
		Assignment6 a2 = new Assignment6();
		
		System.out.println("Transctions on a1 are as below:-");
		a1.debitAmt();
		a1.creditAmt();
		a1.creditAmt();
		a1.creditAmt();
		a1.printStatement();
		a1.printCountInfo();
		
		System.out.println("\nTransctions on a2 are as below:-");
		a2.creditAmt();
		a2.printStatement();
		a2.printStatement();
		a2.printStatement();
		a2.printCountInfo();
		
		System.out.println("\nTotal transctions are as below:-");
		System.out.println("total debit Operations ->"+totalDebitCount+"\ntotal credit Operations ->"+totalCreditCount+"\ntotal printstatement Operations ->"+totalPrintStatementCount);
	}
}