/*
Assignment - 1 : 19th April'25
Write a program for below requirement.
Employee has firstname, lastname and employeeId (int), it should be printable.
output :
Maulik Kanani 1212

*/

class Assignment1{
	
	String empDetails(){
		String fname = "Saurabh";
		String lName = "Dighe";
		int empID = 68855;
		String employer = "Dassault Systemes";
	
		return "Name: "+fname+" "+lName+"\nEmployer: "+employer+"\nEmployee ID: "+empID;
	}
	
	public static void main(String[] args){
		System.out.println(new Assignment1().empDetails());
		
	}
}