/*
 * WAP to to return Techno if uppercase count is more than lowercase count, return credits if lowercase count is more.
 * return  technocredits if both are exactly same.
 */
package assignments;

public class Assignment33 {
	int getUpperCaseCount(String str) {
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i)))
				count++;
		}
		return count;
	}
	
	int getLowerCaseCount(String str) {
		int count = 0;
		for(int i=0; i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i)))
				count++;
		}
		return count;
	}
	
	String checkString(String str) {
		int upperCaseCount = getUpperCaseCount(str);
		int lowerCaseCount = getLowerCaseCount(str);
		if(upperCaseCount>lowerCaseCount)
			return "Techno";
		else if(lowerCaseCount>upperCaseCount)
			return "Credits";
		else if(lowerCaseCount == upperCaseCount)
			return "TechnoCredits";
		return "INVALID STRING";
	}
	
	public static void main(String[] args) {
		Assignment33 assignment33 = new Assignment33();
		System.out.println(assignment33.checkString("TEChno"));
		System.out.println(assignment33.checkString("Maulik"));
		System.out.println(assignment33.checkString("KANANI"));
	}
}
