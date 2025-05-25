package inheritance;

public class B extends A {
	int x=10;
	
	void m2() {
		System.out.println("Class b m2");
	}
	
	public static void main(String[] args) {
		A a = new B();
		a.m1();
		
	}
}
