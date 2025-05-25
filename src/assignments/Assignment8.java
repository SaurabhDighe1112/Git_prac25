/*
Assignment 8 class Bank operations
methods creditAmount should increase balance by user specified amount
debitAmount should debit balance by user specified amount
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

class Assignment8{
	long balance;
	
	void creditAmount(int amt){
		balance+=amt;
		System.out.println("Rs."+amt+" credited to your account");
	}
	void debitAmount(int amt){
		if(amt<balance){
			balance-=amt;
			System.out.println("Rs."+amt+" debited from your account");
		}else
			System.out.println("You account balance is not sufficient to withdraw "+amt);
	}
	void display(){
		System.out.println("your current balance is Rs."+balance);
	}
	void initBalance(int amt){
		balance = amt;
		System.out.println("Your account has been initialise with balance of Rs."+amt);
	}
	
	public static void main(String[] args){
		Assignment8 a = new Assignment8();
		a.initBalance(5000);
		a.creditAmount(2000);
		a.creditAmount(500);
		a.debitAmount(9500);
		a.creditAmount(1500);
		a.debitAmount(6000);
		a.display();
	}
}