package inheritance;

public class A {
	private int x=100;
	
	void m1() {
		System.out.println(x);
		m2();
	}
	
	private void m2() {
		System.out.println("private m2");
	}
}
