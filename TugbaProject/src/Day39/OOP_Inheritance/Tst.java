package Day39.OOP_Inheritance;

class A{
	public A() {
		System.out.println("A");
	}
}
class B extends A{
	public B() {
		System.out.println("B");
	}
}

public class Tst extends B {
	
public Tst() {
	System.out.println("C");
}
	public static void main(String[] args) {
		B obj=new B();

	}

}
