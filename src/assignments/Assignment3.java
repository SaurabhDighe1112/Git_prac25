/*
3. Assignment - 3 : 20th April'25
Create a class called EmployeeDetails, 
empid, empFirstName, empLastName, empSalary.
craete a method to initialised empid, empFirstName, empLastName, empSalary.
create a method to update empSalary. salary should be updated by 2000 rs. when update info is called and should update by 1000 when print info is called
printDetail method should print all the details of employee.
output :
Employee id is 123
Employee first name is Maulik
Employee last name is Kanani
Employee current salary is 7000

*/
package assignments;

class Assignment3{
	String empFirstName, empLastName;
	int empID, empSalary;
	
	void updateEmpFirstName(){
		empFirstName = "Saurabh";
		updateEmpSalary();
	}
	
	void updateEmpLastName(){
		empLastName = "Dighe";
		updateEmpSalary();
	}
	
	void updateEmpID(){
		empID = 1112;
		updateEmpSalary();
	}
	
	void updateEmpSalary(){
		empSalary+=2000;
	}
	
	void printDetails(){
		empSalary+=1000;
		System.out.println("Employee id is:- "+empID);
		System.out.println("Employee first name is:- "+empFirstName);
		System.out.println("Employee last name is:- "+empLastName);
		System.out.println("Employee current salary is:- "+empSalary);
	}
	
	public static void main(String[] args){
		Assignment3 a = new Assignment3();
		a.updateEmpFirstName();
		a.updateEmpLastName();
		a.updateEmpID();
		a.printDetails();
	}
}