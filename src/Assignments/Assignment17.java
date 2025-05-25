/*
Assignment17
for given string print all character on new line.
input: techno
*/
class Assignment17{
	void printCharInStr(String str){
		for(int index=0; index<str.length();index++){
			System.out.println(index+"->"+str.charAt(index));
		}
	}
	
	public static void main(String[] args){
		Assignment17 a = new Assignment17();
		a.printCharInStr("techno");
	}
}