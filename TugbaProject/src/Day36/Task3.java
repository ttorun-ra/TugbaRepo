package Day36;

public class Task3 {

	
	    public static Integer covertToInt(String number) {
	        return Integer.valueOf(number);
	    }

	    public static void main(String[] args) {
	    	
	        // fix the code
           try {
	        System.out.println(covertToInt("one"));	       

	    }catch(Exception NumberFormatException) {
	    	System.out.println("it is handled");
	    }
            System.out.println(covertToInt("2"));
          System.out.println(covertToInt("-1"));
	}

}