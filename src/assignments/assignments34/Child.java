package assignments.assignments34;

public class Child extends Parent {
	public static void main(String[] args) {
		Child c1 = new Child();		//Case1
		Parent p = new Parent();	//Case2
		Parent p1 = new Child();	//Case3
		//Child c2 = new Parent();	//CE Case4 Type mismatch: cannot convert from Parent to Child
		Parent p2 = new Parent();	
		Child c3 = new Child();
		p2 = c3;					//Case5 Parent p2 = new Child(); this resolves to Case3
		Parent p3 = new Child();
		Child c4 = new Child();
		c4=(Child)p3;				//Case6 Child c3 = new Child(); resolves to Case2;
		
		c1.display();
		p.display();
		p1.display();
		p2.display();
		c4.display();
	}
}
