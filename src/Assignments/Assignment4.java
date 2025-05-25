/*
4. Assignment - 4 : 22nd April'25 
Create a class called Employee having following instance variable.
firstName, lastName, empId (int), managerld (int), address (String), phoneNumber(String) ["+91-9765463742"] create 5 methods.
1)	updatePrimaryInfo() -> firstName, lastName, empId, managerld
2)	updateSecondaryInfo() -> address, phoneNumber
3)	displayPrimaryInfo() -> firstName, lastName, empId, managerld
4)	displayOtherInfo() -> address, phoneNumber
5)	displayAlllnfo() -> firstName, lastName, empId, managerld, address, phoneNumber
main -> updatePrimaryInfo() -> updateSecondaryInfo() -> displayPrimaryInfo() -> displayOtherInfo() -> displayAlllnfo()
*/
class Assignment4{
	String firstName, lastName, address, phoneNumber;
	int empId, managerld;
	
	void updatePrimaryInfo(){
		firstName= "Saurabh";
		lastName = "Dighe";
		empId = 007;
		managerld = 001;
	}
	
	void updateSecondaryInfo(){
		address = "Rahatani Pune, 411017";
		phoneNumber = "+91-9405003606";
	}
	
	void displayPrimaryInfo(){
		System.out.println("Name: "+firstName+" "+lastName+"\nEmp ID: "+empId+"\nManager ID: "+managerld);
	}
	
	void displayOtherInfo(){
		System.out.println("Address: "+address+"\nPhone Number: "+phoneNumber);
	}
	
	void displayAlllnfo(){
		System.out.println("Name: "+firstName+" "+lastName+"\nEmp ID: "+empId+"\nManager ID: "+managerld+"\nAddress: "+address+"\nPhone Number: "+phoneNumber);
	}
	
	public static void main(String[] args){
		Assignment4 a = new Assignment4();
		a.updatePrimaryInfo();
		a.updateSecondaryInfo();
		System.out.println("Primary info as below:");
		a.displayPrimaryInfo();
		System.out.println("\nSecondary info as below:");
		a.displayOtherInfo();
		System.out.println("\nAll info as below:");
		a.displayAlllnfo();
	}
}