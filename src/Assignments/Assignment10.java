/*
Assignment 10
Based on index print quarter and month name
*/
package Assignments;

class Assignment10{
	String monthName(int monthIndex){
		if(monthIndex>=1 && monthIndex<=12){
			if(monthIndex>=1 && monthIndex<=3){
				if(monthIndex==1)
					return "Month Index "+monthIndex+" is in Q1, Its January.";
				else if(monthIndex==2)
					return "Month Index "+monthIndex+" is in Q1, Its February.";
				else
					return "Month Index "+monthIndex+" is in Q1, Its March.";
			}else if(monthIndex>=4 && monthIndex<=6){
				if(monthIndex==4)
					return "Month Index "+monthIndex+" is in Q2, Its April.";
				else if(monthIndex==5)
					return "Month Index "+monthIndex+" is in Q2, Its May.";
				else
					return "Month Index "+monthIndex+" is in Q2, Its June.";
			}else if(monthIndex>=7 && monthIndex<=9){
				if(monthIndex==7)
					return "Month Index "+monthIndex+" is in Q3, Its July.";
				else if(monthIndex==8)
					return "Month Index "+monthIndex+" is in Q3, Its August.";
				else
					return "Month Index "+monthIndex+" is in Q3, Its September.";
			}else{
				if(monthIndex==10)
					return "Month Index "+monthIndex+" is in Q4, Its October.";
				else if(monthIndex==11)
					return "Month Index "+monthIndex+" is in Q4, Its November.";
				else
					return "Month Index "+monthIndex+" is in Q4, Its December.";
			}
		}
		return "Invalid Month Index";
	}
	
	public static void main(String[] args){
		Assignment10 a = new Assignment10();
		System.out.println(a.monthName(5));
		System.out.println(a.monthName(12));
		System.out.println(a.monthName(-3));
		System.out.println(a.monthName(13));
	}
}