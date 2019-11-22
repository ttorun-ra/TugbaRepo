package Example;

public class Constructor4 {
	
	
	private Constructor4(int data) {
		
		System.out.println("Constructor called");
	}
          public void myMethod() {
	
	System.out.println("My method called");
	
	
}   
    static  Constructor4 create(int data) {
	
	Constructor4 c4=new Constructor4(data);
	
	return c4;
	
	
}


	public static void main(String[] args) {
		
		Constructor4 myClass= Constructor4.create(42);
		
		myClass.myMethod();
		

	}

}
