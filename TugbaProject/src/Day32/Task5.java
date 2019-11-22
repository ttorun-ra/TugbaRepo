package Day32;

public class Task5 {

	public static void main(String[] args) {
		  // Write a boolean method called isOdd,
	    //    which takes an int as input and returns true if the it is odd.


		boolean a=isOdd(5);
		System.out.println(a);
		
	}
      public static boolean isOdd(int num){
    	  
	
	boolean check=num%2!=0;
	if(check) {
		
		check= true;
	}else {
		check=false;
	}
	return check;
}
}
