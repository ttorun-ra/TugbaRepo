package Day39.OOP_Inheritance;

class Parent{
	
	public static void myMethod() {
		System.out.println("Yes I am parents static");
		
	}	public void play() {
			System.out.println("Hi");
		}
	public static void display() {
		System.out.println("a");
	}
	
	}

class Child extends Parent{
	

	public static void myMethod() {
		System.out.println("I am child static");
		
	}public static void display() {
		System.out.println("b");
	}
       public void play() {
	
	System.out.println("Hllo");
}


}
