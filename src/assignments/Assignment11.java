/*
Assignment 11
Write a program to print Day based on day index
*/
package assignments;

class Assignment11{
	
	String getDay(int dayIndex){
		if(dayIndex>=1 && dayIndex<=7){
			if(dayIndex>=1 && dayIndex<=5){
				System.out.println("It's Weekday");
				if(dayIndex==1)
					return "Monday.";
				else if(dayIndex==2)
					return "Tuesday.";
				else if(dayIndex==3)
					return "Wednesday.";
				else if(dayIndex==4)
					return "Thursday.";
				else
					return "Friday.";
			}else{
				System.out.println("It's Weekend");
				if(dayIndex==6)
					return "Saturday.";
				else
					return "Sunday.";
			}
		}else
			return "Invalid day index";	
	}
	
	public static void main(String[] args){
		Assignment11 a = new Assignment11();
		System.out.println(a.getDay(3));
		System.out.println(a.getDay(7));
		System.out.println(a.getDay(0));
		System.out.println(a.getDay(-3));
	}
}