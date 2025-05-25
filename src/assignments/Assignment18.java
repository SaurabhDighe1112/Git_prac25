/*
Assignment18
on user defined string print freq of char e
input: technocredits;
output: e -> 2
*/
package assignments;

class Assignment18{
	void getFreqOfChar_e_inStr(String str){
		int count=0;
		for(int index=0; index<str.length();index++){
			if(str.charAt(index)=='e')
				count++;
		}
		System.out.println("e -> "+count);
	}
	
	public static void main(String[] args){
		Assignment18 a = new Assignment18();
		a.getFreqOfChar_e_inStr("technocredits");
	}
}