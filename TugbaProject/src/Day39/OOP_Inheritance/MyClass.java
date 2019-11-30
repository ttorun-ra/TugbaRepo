package Day39.OOP_Inheritance;

class Police{
	
	public  Police() {
		
		System.out.println("Hey");
	}
}
class Fireman extends Police{
	
	public Fireman() {
		
		System.out.println("Merhaba");
		
	}
}
public  class MyClass extends Fireman{
	
	public MyClass() {
		
		System.out.println("Whats up");
	}

	
	

	public static void main(String[] args) {
		
		Fireman obj=new Fireman();

	}

}
