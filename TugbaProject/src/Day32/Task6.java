package Day32;

public class Task6 {

	public static void main(String[] args) {
		  // Write a String method called firstHalf,
	    //    which takes an String as input and returns first half
		// Write second method called secondHalf
	    //    which takes an String as input and returns second half
	    
		String s1=firstHalf("Tugba rana akif");
		String s2=secondHalf("Tugba");
		
		System.out.println(s1);
		System.out.println(s2);
	}
	    public static String firstHalf(String a) {
	    	
	    	int length=a.length();
	    	int len=length/2;
	    	String s=a.substring(0,len);
	    	return s;
	    }
	    
	    
	    public static String secondHalf(String a) {

	    // Write second method called secondHalf
	    //    which takes an String as input and returns second half

	    	int length=a.length();
	    	int len=length/2;
	    	String s=a.substring(len,length);
	    	return s;
	}
}


