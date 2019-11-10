package Day22Practice;

public class Task4 {

	public static void main(String[] args) {
		// 4. Write a Java program to test if an array contains a specific value

		
		  int[] numbers = {1, 2, 4, 10, 6, 0};
		  
		  for(int i=0;i<numbers.length; i++ ) {
			  if(numbers[i]==2) {
				  
				  System.out.println("I have that number");
			  }else {
				  System.out.println("I don't have it");
			  }
			  
		  }
	}

}
