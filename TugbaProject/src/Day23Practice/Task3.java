package Day23Practice;

public class Task3 {

	public static void main(String[] args) {
		 // Given an array of ints,
	    // print true if it contains no 1's or it contains no 4's.
	    
	    // {1,2,3} => true
	    // {2,3,4} => true
	    // {1,2,4} => false

	
		int [] a = {4,9,8,0,1};
				
		
		boolean b=false;
		boolean b2=false;
		
		for(int i=0;i<a.length;i++) {			
			if(a[i]==1) {				
				b=true;				
			}else if(a[i]==4 )  {
				
				b2=true;				
			} 				
			}
		if(b==true && b2==true) {
				System.out.println("false");
		}else {
			System.out.println("true");
		}
	}

}
