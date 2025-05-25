/*
Assignment12
Print name with count from 1 to 5;
*/
package assignments;

class Assignment12{
	void processData(String str){
		for(int i=1; i<=5;i++){
			System.out.println(str+" "+i);
		}
	}
	
	public static void main(String[] args){
		Assignment12 a = new Assignment12();
		a.processData("Saurabh");
	}
}