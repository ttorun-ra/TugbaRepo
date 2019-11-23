package Day37;



class Calculator{
	
	// private in constructor disables creating object
	
	private Calculator(){
	
	}
		
			
		
	public static int sum(int a, int b) {
		return a+b;
		
	}
}

public class Ex1 {

	public static void main(String[] args) {
		
		int result=Calculator.sum(1, 2);
		
		int result2=Calculator.sum(3, 4);
		
		
		
		

	}

}
