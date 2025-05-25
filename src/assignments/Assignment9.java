/*
Assignment 9
Print students grade based on obtained marks
90(excluding) to 100(including)-> A+
80(excluding) to 90(including)-> A
70(excluding) to 80(including)-> B+
60(excluding) to 70(including)-> B
50(including) to 60(including)-> C
00(including) to 50(excluding)-> Work hard

Any other score to be considered as invalid
*/
package assignments;

class Assignment9{
	String studentGrade(int percentage){
		if(percentage>=0 && percentage<=100){
			if(percentage>90 && percentage<=100){
				return "A+";
			}else if(percentage>80 && percentage<=90){
				return "A";
			}else if(percentage>70 && percentage<=80){
				return "B+";
			}else if(percentage>60 && percentage<=70){
				return "B";
			}else if(percentage>=50 && percentage<=60){
				return "C";
			}else
				return "Work Hard";
		}else{
			return "Invalid Score";
		}
	}
	
	String studentResult(String studentName){
		String aPlusGrade="Maulik Satvik Rushikhet Kiran";
		String aGrade="Akshay Pavan Vijay Milind Vishwas";
		String bPlusGrade="Vishal Rohit Akash";
		String bGrade="Ajay Gaurav Rupesh";
		String cGrade="Chaitanya Madan Vishakha Jyoti";
		String fail="Saurabh Shivraj Nawaj Deepak";
		
		if(aPlusGrade.contains(studentName))
			return studentName+" =>A+";
		else if(aGrade.contains(studentName))
			return studentName+" =>A";
		else if(bPlusGrade.contains(studentName))
			return studentName+" =>B+";
		else if(bGrade.contains(studentName))
			return studentName+" =>B";
		else if(cGrade.contains(studentName))
			return studentName+" =>C";
		else if(fail.contains(studentName))
			return studentName+" =>Fail. Work Hard";
		else
			return studentName+" =>Invalid Student Name";
	}
	
	public static void main(String[] args){
		Assignment9 a = new Assignment9();
		System.out.println(a.studentResult("Saurabh"));
		System.out.println(a.studentResult("Maulik"));
		System.out.println(a.studentResult("Akshay"));
		System.out.println(a.studentResult("Dighe"));
		System.out.println(a.studentResult("Chaitanya"));
	}
}