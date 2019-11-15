package Day23Practice;

public class Task5 {

	public static void main(String[] args) {
		 // Given an array of ints,
	    // print "true" outside of loop, if it does not contains 4
	    // {4, 1, 1} => false
	    // {1, 2, 3} => true
	    // DON'T USE BREAK
	    // Hint: use boolean variable to hold state

		 int [] numbers= {4,1,1};
		 
		 boolean haveFour=true;
		 
		for(int number:numbers) {
			if(number==4) {
				
				haveFour=false;
			}
		}
		if(haveFour) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
		 

