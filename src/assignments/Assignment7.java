/*
class Bank operations
methods creditAmount should increase balance by 300
debitAmount should debit balance by 500
initBalance should initialise balance by given amount
display should print current balance
calling sequence
initBalance(5000)
creditAmount
creditAmount
debitAmount
creditAmount
debitAmount
display
*/
package assignments;

class Assignment7{
	long balance;
	
	void creditAmount(){
		balance+=300;
	}
	void debitAmount(){
		balance-=500;
	}
	void display(){
		System.out.println(balance);
	}
	void initBalance(int depMoney){
		balance = depMoney;
	}
	
	public static void main(String[] args){
		Assignment7 a = new Assignment7();
		a.initBalance(5000);
		a.creditAmount();
		a.creditAmount();
		a.debitAmount();
		a.creditAmount();
		a.debitAmount();
		a.display();
	}
}