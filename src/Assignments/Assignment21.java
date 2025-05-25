/*
Assignment21
Print all duplicate character in given string
input: technocreditst
output:
t
e
c
c
e
t
t
*/
package Assignments;

class Assignment21{
	void duplicateCharInStr(String str){
		for(int index=0; index<str.length(); index++){
			char ch = str.charAt(index);
			int count=0;
			for(int index2=0; index2<str.length();index2++){
				if(ch==str.charAt(index2))
					count++;
			}
			if(count>1)
				System.out.println(ch);
		}
	}
	
	void duplicateCharInStrWithStringClassMethods(String str){
		for(int index=0; index<str.length(); index++){
			char ch = str.charAt(index);
			if(str.indexOf(ch)!=str.lastIndexOf(ch))
				System.out.println(ch);
		}
	}
	
	public static void main(String[] args){
		Assignment21 a = new Assignment21();
		System.out.println("Output without String class method");
		a.duplicateCharInStr("technocreditst");
		System.out.println("\nOutput with String class method");
		a.duplicateCharInStrWithStringClassMethods("technocreditst");
	}
}