/*
Assignment22
Print all the duplicate char from given string but this char should not repeat.
input: technocreditst
output: tec
*/
package Assignments;

class Assignment22{
	void duplicateChar(String str){
		String duplicateCharInStr="";
		for(int index=0; index<str.length();index++){
			char ch = str.charAt(index);
			int count=0;
			for(int index2=0; index2<str.length(); index2++){
				if(ch==str.charAt(index2))
					count++;
			}
			if(count>1 && !duplicateCharInStr.contains(String.valueOf(ch)))
				duplicateCharInStr+=String.valueOf(ch);
		}
		System.out.println(duplicateCharInStr);
	}
	
	void duplicateCharWithStringClassMethods(String str){
		String duplicateCharInStr="";
		for(int index=0; index<str.length(); index++){
			char ch = str.charAt(index);
			if(str.indexOf(ch)!=str.lastIndexOf(ch) && !duplicateCharInStr.contains(String.valueOf(ch)))
				duplicateCharInStr+=String.valueOf(ch);
		}
		
		System.out.println(duplicateCharInStr);
	}
	
	public static void main(String[] args){
		Assignment22 a = new Assignment22();
		System.out.println("Duplicate non repeating char in string without using String class methods are as below:");
		a.duplicateChar("technocreditst");
		System.out.println("\nDuplicate non repeating char in string using String class methods are as below:");
		a.duplicateCharWithStringClassMethods("technocreditst");
	}
}