// te3ch4.5noc7red8.1its
//3+4.5+7+8.1

package interview_Coding_Prac;

public class addDigitsConsideringDecimals {
	static double getSumOfDigits(String str){
		double sum = 0.0;
		for(int i=0; i<str.length()-2;i++){
			if(Character.isDigit(str.charAt(i))){
				if(str.charAt(i+1)=='.'&& Character.isDigit(str.charAt(i+2))){
					int j=i, count=0;
					String temp="";
					while(!Character.isLetter(str.charAt(j))){
						temp += String.valueOf(str.charAt(j));
						j++;
						count++;
					}
					sum+=Double.parseDouble(temp);
					i=i+count;
				}else if(str.charAt(i-1)!='.'){
					sum=sum+Double.parseDouble(String.valueOf(str.charAt(i)));
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(getSumOfDigits("te3ch4.5noc7red8.1its"));
	}
}
