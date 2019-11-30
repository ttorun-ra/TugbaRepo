package Day39.OOP_Inheritance;

public class Test12 {
	
public void print() {
	
	System.out.println("Shirin");
}
	public static void main(String[] args) {
		Tarah obj =new Tarah();
		obj.print();
		

	}

}
class Franco extends Test12{
	public void print() {
		System.out.println("Franco");
	}
}
class Tarah extends Franco{
	
}