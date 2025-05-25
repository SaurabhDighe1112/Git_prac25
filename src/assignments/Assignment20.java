/*
Assignment20
print all unique chars in given string
input: technocredits
output: hnordis
*/
package assignments;

class Assignment20{
	void uniqueCharWithoutStringClassMethod(String str){
		String uniqueStr="";
		for(int index=0; index<str.length(); index++){
			char ch = str.charAt(index);
			int count=0;
			for(int index2=0; index2<str.length(); index2++){
				if(ch==str.charAt(index2))
					count++;
			}
			if(count==1)
				uniqueStr+=String.valueOf(ch);
		}
		System.out.println(uniqueStr);
	}
	
	void uniqueChar(String str){
		String uniqueStr="";
		for(int index=0; index<str.length();index++){
			if(str.indexOf(str.charAt(index))==str.lastIndexOf(str.charAt(index)))
				uniqueStr+=String.valueOf(str.charAt(index));
		}
		System.out.println(uniqueStr);
	}
	
	public static void main(String[] args){
		Assignment20 a = new Assignment20();
		
		a.uniqueCharWithoutStringClassMethod("technocredits");
		a.uniqueChar("technocredits");
	}
}