package Day23Practice;

public class Task4 {

	public static void main(String[] args) {
		 // Given an array of ints,
	    // print true if it contains no 1's

		
		
		int[]arr= {1,2,1,3,1};		

		boolean b=false;
		
		for(int i:arr) {
			
			if(i==1) {
				b=true;				
			}
		}

		if(b=true) {
			System.out.println("I have one");
		}
	}

}
