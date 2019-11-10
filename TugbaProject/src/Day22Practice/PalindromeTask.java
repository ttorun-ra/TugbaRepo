package Day22Practice;

public class PalindromeTask {

	public static void main(String[] args) {
		String s="aabbaa";
		int i=0;
		
		int a=s.length()/2;
		
		int j=s.length()-1;
		
        char [] c = s.toCharArray();

       
        boolean ps=false;
        while (i < a ) {
            if (c[i] == c[(c.length - 1) - i]) {
            	ps=true;
            
        } else {
        	ps=false;
        }
          i++;
        } if(ps==true) {
        	   System.out.println("it is a palindrome number");
           }else {
        	   System.out.println("it is not a palindrome number");
           }
	}
}

	





