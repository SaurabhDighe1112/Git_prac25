package inheritance;

public class C {
	public static void main(String[] args) {
		int x=30;
		int y=50;
		
		x= x+y;
		y=x-y;
		x= x-y;
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}
}
